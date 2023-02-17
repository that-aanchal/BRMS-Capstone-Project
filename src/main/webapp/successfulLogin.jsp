<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <title>BRMS Admin Panel</title>
    <meta content="" name="description" />

    <meta content="" name="keywords" />

    <!-- Favicons -->
    <link href="assets/img/bus.png" rel="icon" />
    

    <!-- Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
      rel="stylesheet"
    />

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet" />
    <link
      href="assets/vendor/bootstrap/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/glightbox/css/glightbox.min.css"
      rel="stylesheet"
    />
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet" />

    
    <link href="css/style.css" rel="stylesheet" />
  </head>

  <body>
    <!-- ======= Header ======= -->
    <header id="header" class="header fixed-top">
      <div
        class="container-fluid container-xl d-flex align-items-center justify-content-between"
      >
        <a href="successfulLogin.jsp" class="logo d-flex align-items-center">
          <img src="assets/img/bus_home.gif" alt="bus gif icon" />
          <span>BRMS User Panel</span>
        </a>

        <nav id="navbar" class="navbar">
          <ul>
                
                <li><a class="nav-link scrollto logo d-flex align-items-center" href="#help">Welcome User
              <img src="assets/img/man.png" alt="admin" /></a></li>
              </ul>
           
          <i class="bi bi-list mobile-nav-toggle"></i>
        </nav>
        <!-- .navbar -->
      </div>
    </header>
    <!-- End Header -->

    <!-- ======= Hero Section ======= -->
    <section id="hero" class="hero d-flex align-items-center">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 d-flex flex-column justify-content-center">
            <h1 data-aos="fade-up">
              With great power, comes great responsibility
            </h1><br><br>
             <form method = "post" >
             
                  <h3  style="color:#B3005E;"> Enter Login Id :  </h3> <span><input type="text"  name ="loginId"></span>
                  <br>
                  <br>
             <button type="submit" class="  btn-get-started scrollto d-inline-flex align-items-center justify-content-center align-self-center"  formaction="DeleteController" > Delete</button> 
             
             <button type="submit"  class="btn-get-started scrollto d-inline-flex align-items-center justify-content-center align-self-center  btnspace" formaction="afterUpdate.jsp"  >Update</button>
              
             </form>
            
            <div data-aos="fade-up" data-aos-delay="600">
              <div class="text-center text-lg-start">
                
              </div>
            </div>
          </div>
          <div
            class="col-lg-6 hero-img"
            data-aos="zoom-out"
            data-aos-delay="200"
          >
            <img src="assets/img/admin_page.jpg" class="img-fluid" alt="" />
          </div>
        </div>
      </div>
    </section>
    <!-- End Hero -->

  

    <!-- Vendor JS Files -->
    <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>

    <!-- Template Main JS File -->
    <script src="js/main.js"></script>
  </body>
</html>
