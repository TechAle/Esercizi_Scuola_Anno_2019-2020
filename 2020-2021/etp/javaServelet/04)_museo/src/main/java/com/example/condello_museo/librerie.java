package com.example.condello_museo;

import java.io.PrintWriter;

public class librerie {


    
    public static void printHeader(PrintWriter wt, int tipo) {
        
        switch (tipo) {
            case 0:
                wt.print("<!DOCTYPE html>" +
                        "<html lang=\"en\">" +
                        "<head>" +
                        "    <meta charset=\"UTF-8\">" +
                        "    <title>Museo</title>" +
                        "" +
                        "    <style>" +
                        "        html, body {" +
                        "            height: 100vh;" +
                        "            padding: 0;" +
                        "            margin: 0;" +
                        "" +
                        "        }" +
                        "        header {" +
                        "            height: 18%;" +
                        "            background-color: black;" +
                        "        }" +
                        "" +
                        "        #down {" +
                        "            height: 82%;" +
                        "            background-image: url(\"./img/background.jpg\");" +
                        "            background-position: center;" +
                        "            background-repeat: no-repeat;" +
                        "            background-size: cover;" +
                        "        }" +
                        "" +
                        "        #body {" +
                        "            height: 80%;" +
                        "        }" +
                        "" +
                        "        #footer {" +
                        "            height: 20%;" +
                        "            background: rgb(0, 0, 0);" +
                        "            background: linear-gradient(0deg, rgba(0, 0, 0, 1) 0%, rgba(0, 0, 0, 0.9121849423363095) 57%, rgba(0, 0, 0, 0) 100%);" +
                        "        }" +
                        "" +
                        "        #creat {" +
                        "            text-align: center;" +
                        "            color: white;" +
                        "            padding-top: 6%;" +
                        "        }" +
                        "" +
                        "        #crediti {" +
                        "            position: absolute;" +
                        "            right: 20px;" +
                        "            top: 94%;" +
                        "            font-size: 15px;" +
                        "            border-radius: 3px;" +
                        "        }" +
                        "" +
                        "        #titolo {" +
                        "            width: 50%;" +
                        "            padding-left: 5%;" +
                        "            padding-top: 1%;" +
                        "            color: white;" +
                        "" +
                        "        }" +
                        "" +
                        "        header {" +
                        "            display: inline-flex;" +
                        "            width: 100%;" +
                        "        }" +
                        "" +
                        "        h1 {" +
                        "            margin-bottom: 0;" +
                        "        }" +
                        "" +
                        "        h2 {" +
                        "            margin-top: 0;" +
                        "            padding-left: 50px;" +
                        "        }" +
                        "" +
                        "        #opzioni {" +
                        "            width: 50%;" +
                        "            color: white;" +
                        "            text-align: right;" +
                        "            margin-right: 35px;" +
                        "            margin-top: 35px;" +
                        "            font-size: 50px;" +
                        "        }" +
                        "" +
                        "        #card {" +
                        "            position: absolute;" +
                        "            background-color: white;" +
                        "            margin-left: 4%;" +
                        "            margin-top: 4%;" +
                        "            width: 92%;" +
                        "            height: 60%;" +
                        "            box-shadow: 2px -5px 15px lightgrey;" +
                        "               " +
                        "        }" +
                        "" +
                        "        #content {" +
                        "            margin: 10px 10px 10px 10px;" +
                        "        }" +
                        "" +
                        "        center {" +
                        "            margin-top: 7px;" +
                        "            margin-bottom: 7px;" +
                        "        }" +
                        "" +
                        "        #form_prenotazione {" +
                        "            margin-top: 8px;" +
                        "            padding: 5px 5px 5px 5px;" +
                        "            border-style: solid;" +
                        "            border-width: 1px;" +
                        "            border-color: lightgrey;" +
                        "        }" +
                        "" +
                        "" +
                        "        fieldset {" +
                        "           width: 300px;" +
                        "" +
                        "        }" +
                        "" +
                        "        fieldset input{" +
                        "            float: right;" +
                        "        }" +
                        "" +
                        "        #risultato {" +
                        "            border-radius: 4px;" +
                        "            width: 100%;" +
                        "            padding-top: 8px;" +
                        "            padding-bottom: 8px;" +
                        "        }" +
                        "        .errore {" +
                        "            background-color: #f86969;" +
                        "        }" +
                        "        .corretto {" +
                        "            background-color: greenyellow;" +
                        "        }" +
                        "" +
                        "        label {" +
                        "            float: left" +
                        "        }" +
                        "" +
                        "    </style>" +
                        "" +
                        "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">" +
                        "</head>" +
                        "<body>" +
                        "" +
                        "<header>" +
                        "    <div id=\"titolo\"><h1>Il museo</h1><h2>Di Novara</h2></div>" +
                        "" +
                        "    <div id=\"opzioni\">" +
                        "        <i class=\"fas fa-arrow-left\" onclick=\"window.location = 'home.html'\"></i>" +
                        "    </div>" +
                        "</header>" +
                        "" +
                        "<div id=\"down\">" +
                        "" +
                        "    <div id=\"body\">" +
                        "        <div id=\"card\">" +
                        "            <div id=\"content\">");
                break;
            case 1:
                wt.print("<!DOCTYPE html>" +
                        "<html lang=\"en\">" +
                        "<head>" +
                        "    <meta charset=\"UTF-8\">" +
                        "    <title>Museo</title>" +
                        "" +
                        "    <style>" +
                        "        html, body {" +
                        "            height: 100vh;" +
                        "            padding: 0;" +
                        "            margin: 0;" +
                        "" +
                        "        }" +
                        "        header {" +
                        "            height: 18%;" +
                        "            background-color: black;" +
                        "        }" +
                        "" +
                        "        #down {" +
                        "            height: 82%;" +
                        "            background-image: url(\"./img/background.jpg\");" +
                        "            background-position: center;" +
                        "            background-repeat: no-repeat;" +
                        "            background-size: cover;" +
                        "        }" +
                        "" +
                        "        #body {" +
                        "            height: 80%;" +
                        "        }" +
                        "" +
                        "        #footer {" +
                        "            height: 20%;" +
                        "            background: rgb(0, 0, 0);" +
                        "            background: linear-gradient(0deg, rgba(0, 0, 0, 1) 0%, rgba(0, 0, 0, 0.9121849423363095) 57%, rgba(0, 0, 0, 0) 100%);" +
                        "        }" +
                        "" +
                        "        #creat {" +
                        "            text-align: center;" +
                        "            color: white;" +
                        "            padding-top: 6%;" +
                        "        }" +
                        "" +
                        "        #crediti {" +
                        "            position: absolute;" +
                        "            right: 20px;" +
                        "            top: 94%;" +
                        "            font-size: 15px;" +
                        "            border-radius: 3px;" +
                        "        }" +
                        "" +
                        "        #titolo {" +
                        "            width: 50%;" +
                        "            padding-left: 5%;" +
                        "            padding-top: 1%;" +
                        "            color: white;" +
                        "" +
                        "        }" +
                        "" +
                        "        header {" +
                        "            display: inline-flex;" +
                        "            width: 100%;" +
                        "        }" +
                        "" +
                        "        h1 {" +
                        "            margin-bottom: 0;" +
                        "        }" +
                        "" +
                        "        h2 {" +
                        "            margin-top: 0;" +
                        "            padding-left: 50px;" +
                        "        }" +
                        "" +
                        "        #opzioni {" +
                        "            width: 50%;" +
                        "            color: white;" +
                        "            text-align: right;" +
                        "            margin-right: 35px;" +
                        "            margin-top: 35px;" +
                        "            font-size: 50px;" +
                        "        }" +
                        "" +
                        "        #card {" +
                        "            position: absolute;" +
                        "            background-color: white;" +
                        "            margin-left: 4%;" +
                        "            margin-top: 4%;" +
                        "            width: 92%;" +
                        "            height: 60%;" +
                        "            box-shadow: 2px -5px 15px lightgrey;" +
                        "        }" +
                        "" +
                        "        #content {" +
                        "            margin: 10px 10px 10px 10px;" +
                        "        }" +
                        "" +
                        "        #prenotazioni {" +
                        "            height: 25px;" +
                        "            border-radius: 1px;" +
                        "            margin-left: -50px;" +
                        "        }" +
                        "" +
                        "        center {" +
                        "            margin-top: 7px;" +
                        "            margin-bottom: 7px;" +
                        "        }" +
                        "" +
                        "        #form_prenotazione {" +
                        "            margin-top: 8px;" +
                        "            padding: 5px 5px 5px 5px;" +
                        "            border-style: solid;" +
                        "            border-width: 1px;" +
                        "            border-color: lightgrey;" +
                        "        }" +
                        "" +
                        "        #risultato {" +
                        "            height: 40vh;" +
                        "            overflow-y: scroll;" +
                        "            margin-top: 5px;" +
                        "        }" +
                        "" +
                        "    </style>" +
                        "" +
                        "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">" +
                        "</head>" +
                        "<body>" +
                        "" +
                        "<header>" +
                        "    <div id=\"titolo\"><h1>Il museo</h1><h2>Di Novara</h2></div>" +
                        "" +
                        "    <div id=\"opzioni\">" +
                        "        <i class=\"fas fa-arrow-left\" onclick=\"window.location = 'home.html'\"></i>" +
                        "    </div>" +
                        "</header>" +
                        "" +
                        "<div id=\"down\">" +
                        "" +
                        "    <div id=\"body\">" +
                        "        <div id=\"card\">" +
                        "            <div id=\"content\">");
                break;
        }
        
    }

    public static void printFooter(PrintWriter wt) {
        wt.print(               "</div>" +
                            "</div> " +
                        "</div>" +
                        " <div id=\"footer\">" +
                            "<div id=\"creat\">Creato da Condello Alessandro per fini didattici</div>" +
                            "<button id=\"crediti\" onclick=\"window.location = 'crediti.html'\">Crediti</button>" +
                        "</div>" +
                    "</div>" +
                "</body>" +
            "</html>");
    }
    
}
