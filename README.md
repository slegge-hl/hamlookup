# hamlookup
CQ, CQ, CQ... calling CQ... de...

HamLookup FCC Amateur Radio Callbook Search

Spring Framework MVC Web Application for searching the US FCC Amateur Radio Licensee database.

Use Maven to compile, e.g. "mvn clean install".

The resulting 'hamlookup-1.0.war' has been successfully tested on both Apache Tomcat & JBoss/WildFly.

Runtime pre-req: FCC database (available at the below listed URL) imported into a MySQL DB called 'l_amat' (access to which is configured by org.hamlookup.web.config.ApplicationContextConfig).

The entire FCC Amateur Radio database is available in the following zip file:

    http://wireless.fcc.gov/uls/data/complete/l_amat.zip

FCC Database table creation SQL available here (create only the tables in zip):

    http://wireless.fcc.gov/uls/ebf/pa_ddef49.txt

Additional, general FCC Database details found here:

    http://wireless.fcc.gov/uls/index.htm?job=transaction&page=weekly

