default:
        WebDriverManager.chromedriver().setup();
ChromeOptions chromeOptions = new ChromeOptions();

// THEM: kiem tra headless mode cho CI/CD
boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));
    if (isHeadless) {
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--window-size=1920,1080");
    }

            if (deviceName != null && !deviceName.isEmpty()) {
Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", deviceName.trim());
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
    } else {
            chromeOptions.addArguments("start-maximized");
    }
            return new ChromeDriver(chromeOptions);