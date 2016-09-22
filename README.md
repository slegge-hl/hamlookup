# hamlookup
HamLookup FCC Amateur Radio Callbook Search

Spring Framework MVC Web Application for searching the US FCC Amateur Radio Licensee database.

Pre-req: FCC database (available at the below listed URL) imported into a MySQL DB called 'l_amat' (access to which configured by the ApplicationContextConfig).

The entire FCC Amateur Radio database is available in the following zip file:

    http://wireless.fcc.gov/uls/data/complete/l_amat.zip

FCC Database table (only need tables contained in l_amat.zip) creation SQL available here:

    http://wireless.fcc.gov/uls/ebf/pa_ddef49.txt

Additional, general FCC Database details found here:

    http://wireless.fcc.gov/uls/index.htm?job=transaction&page=weekly
