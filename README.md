# uoft-waitlist-alerts

## Problem Domain
The problem domain that we hope to make an application in is education. Specifically, we hope to help make the course selection process easier for students on Acorn, especially during the **no waitlist period**.
 
## Application Description
For our application, we hope to build a web application with the Spring Boot framework as the backend API and use Java Swing as a frontend. We noticed that during the no-waitlist period, students often have to refresh Acorn repeatedly to enrol in high-demand courses. To fix this process and make it more efficient, we would like to set up a notification system so that students can be notified within 5 minutes of a course spot opening up via the UofT Timetable API.

### Documentation Link
API Link: https://api.easi.utoronto.ca/ttb/getPageableCourses
FAQ Link: https://help.acorn.utoronto.ca/timetable-builder-qa/

### API Request Screenshot
<img width="702" alt="Screenshot 2023-10-01 at 6 29 35 PM" src="https://github.com/Ram-Raghav-S/uoft-watilist-alerts/assets/44104695/2b370ba3-8364-4786-bed1-cc0fd3d7b98c">

### Example Output
<img width="1002" alt="Screenshot 2023-10-01 at 6 45 20 PM" src="https://github.com/Ram-Raghav-S/uoft-watilist-alerts/assets/44104695/5c1ca58d-9515-4107-b6ab-4e47b7c143fd">


### List of Technical Problems
So far, the main problem we faced was adding **OkHTTP** to the classpath and installing the library. We are hoping to convert our project into a Maven project to make use of easy dependency management.
