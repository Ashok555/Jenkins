

public class PFLOGIN {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		long start = System.currentTimeMillis();
		System.out.println(start);
		driver.get("https://www.epfindia.gov.in/site_en/For_Employees.php");
		driver.findElement(By.xpath("//a[contains(text(),' (OCS/OTCP)')]")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(list.get(1));
		
//		for (String handel : windowHandles) {
//			System.out.println(windowHandles);
//			if (!handel.equals(windowHandle)) {
//				driver.switchTo().window(handel);
//				
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				
//				driver.findElement(By.id("userName")).sendKeys("100865060846");
//				driver.findElement(By.id("password")).sendKeys("Akon@555");
//				
//			}
//			
//		}
//		driver.quit();
//		
		
		
		
	}

}
