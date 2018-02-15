FROM tomcat:7-jre8
ADD target/spring_mvc_hibernate.war /usr/local/tomcat/webapps/spring_mvc_hibernate.war
CMD ["catalina.sh", "run"]