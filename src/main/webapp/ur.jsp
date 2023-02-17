<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>User Registration</title>

    <!-- Icons font CSS
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">-->
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">-->

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
     <link href="css/style.css" rel="stylesheet" />
</head>

<body >
 <!-- ======= Header ======= -->
    <header id="header" class="header fixed-top">
      <div
        class="container-fluid container-xl d-flex align-items-center justify-content-sm-end"
      >
        <a href="index.html" class="logo d-flex align-items-center">
          <img src="assets/img/bus_home.gif" alt="" />
          <span>BRMS</span>
        </a>

        <nav id="navbar" class="navbar">
          <ul>
            <li><a class="nav-link scrollto" href="#book">Book Ticket</a></li>
            <li class="dropdown">
              <a href="#"
                ><span>Login</span> <i class="bi bi-chevron-down"></i
              ></a>
              <ul>
                <li><a href="ur.jsp">Create Account</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="#">Update Profile</a></li>
                <li><a href="#">Delete Profile</a></li>
              </ul>
            </li>
            <li>
              <a class="nav-link scrollto" href="adminlogin.jsp">Admin Panel</a>
            </li>
            <li><a class="nav-link scrollto" href="#help">Help</a></li>
            <li class="dropdown">
              <a href="#"
                ><span>Manage Booking</span> <i class="bi bi-chevron-down"></i
              ></a>
              <ul>
                <li><a href="#">My Tickets</a></li>
                <li><a href="#">Cancel Ticket</a></li>
                <li><a href="#">Support</a></li>
              </ul>
            </li>
          </ul>
          <i class="bi bi-list mobile-nav-toggle"></i>
        </nav>
        <!-- .navbar -->
      </div>
    </header>
    <!-- End Header -->
       <div class="container">
        <div class="row">
          <div class="col-lg-6 d-flex flex-column justify-content-sm-end">
            <div data-aos="fade-up" data-aos-delay="600">
              <div class="text-center text-lg-start">
                
              </div>
            </div>
          </div>
          
        </div>
        </div>
    
   
    <!-- End Hero -->
    <div class="page-wrapper font-poppins" style ="background:#30E3DF" >  <!-- style = "background:#C0EEF2" -->
          <div class="wrapper wrapper--w680"> 
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Registration Form</h2>
                    <form method="post" action ="SignUpController">
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">LoginId</label>
                                    <input class="input--style-4" type="text" name="loginId" >
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <input class="input--style-4" type="password" name="password" >
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">first name</label>
                                    <input class="input--style-4" type="text" name="first_name" >
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">last name</label>
                                    <input class="input--style-4" type="text" name="last_name">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">AadharNumber</label>
                                    <input class="input--style-4" type="text" name="AadharNumber" >
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Physical_Disability</label>
                                    <input class="input--style-4" type="text" name="Physical_disability" >
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Birthday</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="birthday" >
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="address" >
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <input class="input--style-4" type="email" name="email" >
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone Number</label>
                                    <input class="input--style-4" type="text" name="phone" >
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Age</label>
                                    <input class="input--style-4" type="number" name="age" >
                                </div>
                            </div>
                        </div>
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        </div>
    

    <!-- Jquery JS-
    <script src="vendor/jquery/jquery.min.js"></script>
     Vendor JS
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>-->

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body>

</html>
<!-- end document-->