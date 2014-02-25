<%@page import = "java.util.*" session="true"%>
<HTML> 
    <HEAD>
        <TITLE>Using Sessions to Track Users</TITLE>
    </HEAD> 

    <BODY>
        <% 
        Integer counter = (Integer)session.getAttribute("counter");
	java.util.Date now = new java.util.Date(session.getCreationTime());
	java.util.Date yes = new java.util.Date(session.getLastAccessedTime());
	long yesmillis=yes.getTime();
	long millis=now.getTime();
	millis=yesmillis-millis;
	System.out.println(millis);
	System.out.println(yesmillis);
	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
	String ausgabe = sdf.format(now);
	System.out.println(ausgabe);
	millis=millis/1000;
	long sekunden=millis%60;
	millis=millis/60;
	long minuten=millis%60;
	millis=millis/60;
	long stunden=millis%24;
	millis=millis/24;
	long tage=millis;
	System.out.println(tage+":"+stunden+":"+minuten+":"+sekunden);
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }

        session.setAttribute("counter", counter);
        %>
        <H1>Using Sessions to Track Users</H1>
        Session ID: <%=session.getId()%>
        <BR>
        Session creation time: <%=new Date(session.getCreationTime())%>
        <BR>
        Last accessed time: <%=new Date(session.getLastAccessedTime())%>
        <BR>
        Number of times you've been here: <%=counter%> 
	<br>
	Auf dieser Seite verbrachte Zeit:<%=tage+":"+stunden+":"+minuten+":"+sekunden %>
    </BODY> 
</HTML>