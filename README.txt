I have written 26 steps to make code looks cleaner in Feature file.
-	I have used next page URL in the script to complete my test case that is mentioned in the email.  
-	I have commented out steps for given URL (cookie, assertion and click on Get a quote)
-	I have used assertion method to assert Life Insurance Header 
-	I have given explicit wait where necessary
-	I have also taken 2 screenshots which will store in C drive
-	I have used scroll method where necessary 
-	I have used Select class to enter date of birth with using TAB keys   

reCaptcha: 
On clicking manually "Get a quote" button authorised request returns 302 http status code hence it redirects to relevant page however while clicking on "Get a quote" button on Automation test authorised request returns 403 http status code which is redirecting to reCapatcha screen instead of next relevant page. Due to this security implementation, end-to-end test is not possible. There are some external applications that can break in API but it is not right ethically. 
In order for selenium to achieve reCaptcha, there are external companies (i.e. 2captcha.com) that provides a paid service whereby then can overcome reCaptcha with API key.
However I do not feel that is ethically right thing to do.
