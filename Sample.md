<h1 align="center">Image Mapping</h1>

- Ex No. : 1
- Date : 

# Aim
The aim of this exercise is to learn about image mapping in HTML. Image mapping allows you to create clickable areas on an image, each linking to a different destination.

# Procedure
1. Create an HTML file and add an image using the `<img>` tag.
2. Use the `usemap` attribute in the `<img>` tag to link the image to a map.
3. Define the map using the `<map>` tag with a unique name.
4. Inside the `<map>` tag, define the clickable areas using the `<area>` tag. The `shape` attribute can be used to specify the shape of the area (rect, circle, poly), and the `coords` attribute to specify the coordinates of the area.
5. The `href` attribute in the `<area>` tag is used to specify the link destination.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Solar Map</title>
    <style>
        body {
            color: #CCCCCC;
        }
        .solar {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        #title:hover {
            transform: scale(1.1);
        }
    </style>
</head>
<body style="background: url('Starry_Background.jpg')">
        <map name="SolarMap">
            <area shape="circle" coords="680 340 80" alt="Jupiter" href="https://solarsystem.nasa.gov/planets/jupiter/overview/" target="_blank" />
            <area shape="polygon" coords="230 330 340 325 390 270 460 330 540 345 455 350 380 400 330 350" alt="Saturn" href="https://solarsystem.nasa.gov/planets/saturn/overview/" target="_blank" />
            <area shape="circle" coords="920 340 10" alt="Earth" href="https://solarsystem.nasa.gov/planets/earth/overview/" target="_blank" />
            <area shape="rect" coords="1070 0 1200 670" alt="Sun" href="https://solarsystem.nasa.gov/solar-system/sun/overview/" target="_blank" />
        </map>
    <div class="solar">
        <h2 id="title" style="text-align: center;">Solar Photo Map</h2>
        <img src="Solar_System.jpg" usemap="#SolarMap" alt="Solar System" />
    </div>

</body>
</html>
```

# Output
![Solar System](Ex-1/Output/Snap.png)

<div style="page-break-after: always"></div>

<h1 align="center">CSS (Internal, External, Inline)</h1>

- Ex No. : 2
- Date : 

# Aim
The aim of this exercise is to learn about the different ways of adding CSS to an HTML document.

# Procedure
1. Create an HTML file and add some content to it.
2. Add a `<style>` tag inside the `<head>` tag to add internal CSS.
3. Add an external CSS file and link it to the HTML file using the `<link>` tag.
4. Add inline CSS to the HTML elements.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Types of Galaxies</title>
    <!-- External CSS-->
    <link rel="stylesheet" href="index.css">
    <!-- Internal CSS-->
    <style>
        .container{
            display: flex;
            flex-direction: row;
            flex-wrap: wrap;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body style="background-image: url('Starry_Background.jpg');">
    <!-- Inline CSS-->
    <h1 style="text-align: center; color: white;">Types of Galaxies</h1>
    <div class="container">
        <div class="card">
            <img class="card-img" src="Spiral Galaxy.webp" alt="Spiral">
            <div class="card-body">
                <h1>Spiral Galaxies</h1>
                <p>These galaxies resemble giant rotating pinwheels with a pancake-like disk of stars and a central bulge or tight concentration of stars.</p>
            </div>
        </div>
        <div class="card">
            <img class="card-img" src="Elliptical.webp" alt="Elliptical">
            <div class="card-body">
                <h1>Elliptical Galaxies</h1>
                <p>Unlike spirals, elliptical galaxies usually contain little gas and dust and show very little organization or structure. The stars orbit around the core in random directions and are generally older than those in spiral galaxies since little of the gas needed to form new stars remains</p>
            </div>
        </div>
        <div class="card">
            <img class="card-img" src="Lenticular.webp" alt="Lenticular">
            <div class="card-body">
                <h1>Lenticular Galaxies</h1>
                <p>Lenticular galaxies are a kind of cross between spirals and ellipticals. They have the central bulge and disk common to spiral galaxies but no arms. But like ellipticals, lenticular galaxies have older stellar populations and little ongoing star formation.</p>
            </div>
        </div>
    </div>
</body>
</html>
```
* index.css
```css
.card {
    width: 400px;
    /* height: 300px; */
    background-color: rgba(0, 0, 0, 0.2);
    color: white;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    overflow: hidden;
    position: relative;
    margin: 20px;
    display: inline-block;
    vertical-align: top;
    transition: all 0.3s ease-in-out;
}

.card:hover {
    transform: scale(1.1);
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
}

.card .card-img {
    width: 50%;
    height: 50%;
    border-radius: 10px;
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    transition: all 0.3s ease-in-out;
}

.card .card-content {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    padding: 20px;
    box-sizing: border-box;
    color: #fff;
}
```

# Output
![Types of Galaxies](Ex-2/Output/Snap.png)

<div style="page-break-after: always"></div>

<h1 align="center">Javascript Form Validation</h1>

- Ex No. : 3
- Date : 

# Aim
The aim of this exercise is to learn about form validation using Javascript.

# Procedure
1. Create an HTML file and add a form to it.
2. Add a `<script>` tag inside the `<head>` tag to add Javascript code.
3. Add a function to validate the form.
4. Add an event listener to the form to call the function when the form is submitted.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Space Data Validation</title>

</head>
    <frameset rows="5%, 50%, 5%">
        <frame src="header.html" name="header">
        <frame src="main.html" name="main">
        <frame src="footer.html" name="footer">
    </frameset>
</html>
```
* header.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navbar</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <nav>
        <center>
            <h1>Space Data Validation</h1>
        </center>
    </nav>
</body>
</html>
```
* main.html
```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Main</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
  </head>
  <body>
    <div class="flex-row">
      <form class="flex-col" onsubmit="handleSubmit(event)">
        <label for="planet">Select a Planet</label>
        <select id="planet" onchange="handleSelect(event)">
          <option value="-">-</option>
          <option value="mercury">Mercury</option>
          <option value="venus">Venus</option>
          <option value="earth">Earth</option>
          <option value="mars">Mars</option>
          <option value="jupiter">Jupiter</option>
          <option value="saturn">Saturn</option>
          <option value="uranus">Uranus</option>
          <option value="neptune">Neptune</option>
        </select>
        <input type="submit" value="Fetch" />
      </form>
      <div class="flex-col" id="data"></div>
    </div>
    <script src="script.js"></script>
  </body>
</html>
```
* footer.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Footer</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <footer>
        <center>
            <h6>Copyright <sup>©</sup>2023</h6>
        </center>
    </footer>
</body>
</html>
```
* style.css
```css
html {
    background-image: url("../Starry_Background.jpg");
    color:antiquewhite;
}

input {
    height: 2rem;
    width: 7rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
    scale: 1;
    transition: all 0.5s ease-in-out;
}

input[type="submit"]:hover {
    background-color: #45a049;
    scale: 1.1;
    transition: all 0.5s ease-in-out;
}

label {
    font-size: 1.5rem;
}

select {
    height: 2rem;
    width: 10rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

.flex-col {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    height: 100vh;
}

.flex-row {
    display: flex;
    flex-direction: row;
    justify-content: space-evenly;
    align-items: center;
    gap: 1rem;
    /* height: 100vh; */
}
```
* script.js
```js
let planet;

const handleSubmit = async (e) => {
    e.preventDefault();
    const data = document.getElementById('data');
    const planetspacedata = await fetch(`https://api.le-systeme-solaire.net/rest/bodies/${planet}`);
    const planetdata = await planetspacedata.json();
    data.innerHTML = `
        <h2>${planetdata.englishName}</h2>
        <div class="flex-row">
            <p>Gravity: ${planetdata.gravity}</p>
            <p>Mass: ${planetdata.mass.massValue} ${planetdata.mass.massExponent}</p>
        </div>
        <div class="flex-row">
            <p>Mean Radius: ${planetdata.meanRadius} km</p>
            <p>Escape Velocity: ${planetdata.escape}</p>
        </div>
        <div class="flex-row">
            <p>Rotation Period: ${planetdata.sideralRotation}</p>
            <p>Rotation Velocity: ${planetdata.sideralRotation}</p>
        </div>
        <p>Gravity: ${planetdata.gravity}</p>
    `;

}

const handleSelect = (e) => {
    planet = e.target.value;
}
```

# Output
![Space Data Validation](Ex-3/Output/Snap.png)

<div style="page-break-after: always"></div>

<h1 align="center">Simple Servlet Calling from HTML File</h1>

- Ex No. : 5A
- Date : 

# Aim
The aim of this exercise is to learn about servlets and how to call them from an HTML file.

# Procedure
1. Create a Java project and add a servlet to it.
2. Add the servlet to the `web.xml` file.
3. Create an HTML file and add a anchor tag.
4. Add the link to the servlet in the `href` attribute of the anchor tag.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" />
    <title>Servlet Basics</title>
</head>
<body>
    <div class="flex-col">
        <h1>Servlet Basics</h1>
        <a href="spaceservlet">Access Space Servlet</button>
    </div>
</body>
</html>
```
* SpaceServlet.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space Servlet</title></head>");
        out.println("<body class='flex-col'><h1>Space Servlet</h1>");
        out.println("<table><tr><th>Planet</th><th>Distance</th></tr>");
        out.println("<tr><td>Mercury</td><td>57,910,000</td></tr>");
        out.println("</table></body></html>");
    }
}
```
* web.xml
```xml
<web-app>
    <servlet>
      <servlet-name>SpaceServlet</servlet-name>
      <servlet-class>SpaceServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>SpaceServlet</servlet-name>
        <url-pattern>/spaceservlet</url-pattern>
    </servlet-mapping>
</web-app>
```
* style.css
```css
html {
    background-image: url("./Starry_Background.jpg");
    color:antiquewhite;
}

input,a {
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

a {
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
    text-decoration: none;
    scale: 1;
    transition: all 0.5s ease-in-out;
}

a:hover {
    background-color: #45a049;
    scale: 1.1;
    transition: all 0.5s ease-in-out;
}

label {
    font-size: 1.5rem;
}

select {
    height: 2rem;
    width: 10rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

.flex-col {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    height: 100vh;
}
```

# Output
![Servlet Basics](Ex-5A/Output/Snap%201.png)
![Servlet Basics](Ex-5A/Output/Snap%202.png)

<div style="page-break-after: always"></div>

<h1 align="center">Session Management - HTTP Session Objects</h1>

- Ex No. : 6D
- Date : 

# Aim
The aim of this exercise is to learn about HTTP session objects and how to use them to manage sessions.

# Procedure
1. Create a Java project and add a servlet to it.
2. Add the servlet to the `web.xml` file.
3. Create an HTML file and add a form to it.
4. Add the link to the servlet in the `action` attribute of the form tag.
5. Add a `<script>` tag inside the `<head>` tag to add Javascript code.
6. Add a function to validate the form.
7. Add an event listener to the form to call the function when the form is submitted.
8. Add a button to restore the session.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" />
    <title>Space Data Tracking</title>
</head>
<body>
    <div>
        <h1>Space Data Tracking</h1>
        <form class="flex-col" action="spacesession" method="post">
            <label for="planet">Enter a Planet</label>
            <input type="name" id="planet" name="planet" placeholder="Enter the planet Name" />
            <input type="submit" value="Store" />
          </form>
    </div>
</body>
</html>
```
* SpaceSession.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceSession extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("planet",request.getParameter("planet"));
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Space Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Created</h1>");
        out.println("<a href='restorespacesession'>Click here to see the session</a>");
        out.println("</body></html>");
    }
}
```
* RestoreSpaceSession.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RestoreSpaceSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Space Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Restored</h1>");
        out.println("<h2>Planet: " + session.getAttribute("planet") + "</h2>");
        out.println("</body></html>");
    }
}
```
* web.xml
```xml
<web-app>
    <servlet>
      <servlet-name>SpaceSession</servlet-name>
      <servlet-class>SpaceSession</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>SpaceSession</servlet-name>
        <url-pattern>/spacesession</url-pattern>
    </servlet-mapping>

    <servlet>
      <servlet-name>RestoreSpaceSession</servlet-name>
      <servlet-class>RestoreSpaceSession</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>RestoreSpaceSession</servlet-name>
        <url-pattern>/restorespacesession</url-pattern>
    </servlet-mapping>
</web-app>
```
* style.css
```css
html {
    background-image: url("./Starry_Background.jpg");
    color:antiquewhite;
}

input {
    height: 2rem;
    width: 7rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
    scale: 1;
    transition: all 0.5s ease-in-out;
}

input[type="submit"]:hover {
    background-color: #45a049;
    scale: 1.1;
    transition: all 0.5s ease-in-out;
}

label {
    font-size: 1.5rem;
}

select {
    height: 2rem;
    width: 10rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

.flex-col {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    height: 100vh;
}

.flex-row {
    display: flex;
    flex-direction: row;
    justify-content: space-evenly;
    align-items: center;
    gap: 1rem;
    /* height: 100vh; */
}
```

# Output
![Space Data Tracking](Ex-5B/Output/Snap%201.png)
![Space Data Tracking](Ex-5B/Output/Snap%202.png)
![Space Data Tracking](Ex-5B/Output/Snap%203.png)

<div style="page-break-after: always"></div>

<h1 align="center">Database Management using Servlets</h1>

- Ex No. : 7A
- Date :

# Aim
The aim of this exercise is to learn about database management using servlets.

# Procedure
1. Create a Java project and add a servlet to it.
2. Add the servlet to the `web.xml` file.
3. Create an HTML file and add a form to it.
4. Add the link to the servlet in the `action` attribute of the form tag.
5. Add a `<script>` tag inside the `<head>` tag to add Javascript code.
6. Add a function to validate the form.
7. Add an event listener to the form to call the function when the form is submitted.
8. Store the data in the database.
9. Display the data from the database.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" />
    <title>Space Database</title>
</head>
<body>
    <div class="flex-col">
        <h1>Name - Planet Database</h1>
        <form class="flex-col" action="storespace" method="post">
            <label for="name">Name</label>
            <input type="text" name="name" id="name" placeholder="Enter Name" required />
            <label for="planet">Planet</label>
            <input type="text" name="planet" id="planet" placeholder="Enter Planet" required />
            <input type="submit" />
        </form>
    </div>
</body>
</html>
```
* StoreSpace.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StoreSpace extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String planet = request.getParameter("planet");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/space","root","10022004");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into space values('" + name + "','" + planet + "')");
            stmt.close();
            con.close();
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Store Space</title></head>");
            out.println("<body class='flex-col'><h1>Space Database</h1>");
            out.println("<h2>Space added successfully</h2>");
            out.println("<a href='accessspace'>Click here to see the database</a>");
            out.println("</body></html>");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
```
* AccessSpace.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AccessSpace extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Space</title></head>");
            out.println("<body class='flex-col'><h1>Space Database</h1>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/space","root","10022004");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from space");
            out.println("<table><tr><th>Name</th><th>Planet</th></tr>");
            while(rs.next()) {
                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
```
* web.xml
```xml
<web-app>
    <servlet>
      <servlet-name>StoreSpace</servlet-name>
      <servlet-class>StoreSpace</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>StoreSpace</servlet-name>
        <url-pattern>/storespace</url-pattern>
    </servlet-mapping>

    <servlet>
      <servlet-name>AccessSpace</servlet-name>
      <servlet-class>AccessSpace</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>AccessSpace</servlet-name>
        <url-pattern>/accessspace</url-pattern>
    </servlet-mapping>
</web-app>
```
* style.css
```css
html {
    background-image: url("./Starry_Background.jpg");
    color:antiquewhite;
}

input {
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    cursor: pointer;
    text-decoration: none;
    scale: 1;
    transition: all 0.5s ease-in-out;
}

input[type="submit"]:hover {
    background-color: #45a049;
    scale: 1.1;
    transition: all 0.5s ease-in-out;
}

label {
    font-size: 1.5rem;
}

select {
    height: 2rem;
    width: 10rem;
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

.flex-col {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    height: 100vh;
}

.flex-row {
    display: flex;
    flex-direction: row;
    justify-content: space-evenly;
    align-items: center;
    gap: 1rem;
    /* height: 100vh; */
}
```

# Output
![Space Database](Ex-6/Output/Snap-1.png)
![Space Database](Ex-6/Output/Snap-2.png)
![Space Database](Ex-6/Output/Snap-3.png)

<div style="page-break-after: always"></div>

<h1 align="center">Online Exam Evaluation using Servlets</h1>

- Ex No. : 7B
- Date :

# Aim
The aim of this exercise is to learn about online exam evaluation using servlets.

# Procedure
1. Create a Java project and add a servlet to it.
2. Add the servlet to the `web.xml` file.
3. Create an HTML file and add a form to it.
4. Add the link to the servlet in the `action` attribute of the form tag.
5. Add a `<script>` tag inside the `<head>` tag to add Javascript code.
6. Add a function to validate the form.
7. Add an event listener to the form to call the function when the form is submitted.
8. Validate login before the exam.
9. Evaluate the exam and display the result.

# Program
* index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" />
    <title>Space Exam</title>
</head>
<body>
    <div class="flex-col">
        <h1>Welcome to the Space Exam</h1>
        <form class="flex-col" action="loginexam" method="post">
            <label for="username">Username</label>
            <input type="text" name="username" placeholder="Enter your username">
            <label for="password">Password</label>
            <input type="password" name="password" placeholder="Enter your password">
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
```
* LoginExam.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginExam extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("example") && password.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("accessexam");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Login Exam</title></head>");
            out.println("<body class='flex-col'><h2>Login Failed. Please try again.</h2>");
            out.println("<a href='login.html'>Back to Login</a>");
            out.println("</body></html>");
        }
    }
}
```
* AccessExam.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AccessExam extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null) {
            response.sendRedirect("login.html");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Exam</title></head>");
            out.println("<body class='flex-col'><h2>Welcome to the Space Exam!</h2>");
            out.println("<form class='flex-col' action='evaluationexam' method='post'>");
            out.println("Question 1: What is the largest planet in our solar system?");
            out.println("<input type='text' name='answer1'>");
            out.println("Question 2: Who was the first human to walk on the moon?");
            out.println("<input type='text' name='answer2'>");
            out.println("<input type='submit' value='Evaluate'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}
```
* EvaluationExam.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EvaluationExam extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");

        String correctAnswer1 = "Jupiter";
        String correctAnswer2 = "Neil Armstrong";

        int score = 0;
        if (answer1.equalsIgnoreCase(correctAnswer1)) {
            score += 50;
        }
        if (answer2.equalsIgnoreCase(correctAnswer2)) {
            score += 50;
        }

        HttpSession session = request.getSession();
        session.setAttribute("score", score);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Exam Evaluation</title></head>");
        out.println("<body class='flex-col'><h1>Space Exam Results</h1><h2>Your Score: " + score + "</h2>");
        out.println("</body></html>");
    }
}
```
* web.xml
```xml
<web-app>
    <servlet>
      <servlet-name>LoginExam</servlet-name>
      <servlet-class>LoginExam</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>LoginExam</servlet-name>
        <url-pattern>/loginexam</url-pattern>
    </servlet-mapping>

    <servlet>
      <servlet-name>AccessExam</servlet-name>
      <servlet-class>AccessExam</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>AccessExam</servlet-name>
        <url-pattern>/accessexam</url-pattern>
    </servlet-mapping>

    <servlet>
      <servlet-name>EvaluationExam</servlet-name>
      <servlet-class>EvaluationExam</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>EvaluationExam</servlet-name>
        <url-pattern>/evaluationexam</url-pattern>
    </servlet-mapping>
</web-app>
```
* style.css
```css
html {
    background-image: url("./Starry_Background.jpg");
    color:antiquewhite;
}

input {
    border-radius: 0.5rem;
    border: none;
    padding: 0.5rem;
    margin: 0.5rem 0;
}

input[type="text"],
input[type="password"] {
    padding: 10px;
    margin: 10px;
}

input[type="submit"] {
    padding: 10px 20px;
    background-color: #003366;
    color: #fff;
    border: none;
    cursor: pointer;
}

label {
    font-size: 1.5rem;
}

.flex-col {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 1rem;
    height: 100vh;
}
```

# Output
![Online Exam Evaluation](Ex-9/Output/Snap%201.png)
![Online Exam Evaluation](Ex-9/Output/Snap%202.png)
![Online Exam Evaluation](Ex-9/Output/Snap%203.png)
![Online Exam Evaluation](Ex-9/Output/Snap%204.png)

<div style="page-break-after: always"></div>




