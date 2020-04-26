<%@ page import="com.reimbursement_app_1.jsp.*" %>

<html lang="en">

<head>
  <title>Management TRMS</title>
  <!-- Required meta tags -->
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="bootstrap.min.css" />
  <!-- main.css -->
  <link rel="stylesheet" href="css/main.css" />
  <!-- font awesome -->
  <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css" />
  <!-- google fonts -->
  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" />
</head>

<body>
  <!-- navbar -->

  <nav class="navbar navbar-expand-md">
    <div class="container-fluid">
      <!-- Brand -->
      <a class="navbar-brand text-uppercase" href="#">
     <div class="row">
     <div class="col">
    <h1 class="text-warning mr-5"> <%= initialGreeting.greeting() %> </h1>
    </div>
    </div>
        
      </a>

      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#myNavbar">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navbar links drop down menu -->

      <div class="collapse navbar-collapse justify-content-end" id="myNavbar">
        <ul class="navbar-nav links d-md-none">
          <li class="nav-item">
            <a class="nav-link " href="EmployeeControllerServlet2">View/Edit Your Personal Account Information</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="ReimbursementControllerServlet2">View/Edit Your Pending/Completed Reimbursement Requests</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="ReimbursementControllerServlet">View All Reimbursement Requests in DataBase</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="EmployeeControllerServlet">View All Employees in Database</a>
          </li>
        </ul>

        <!-- nav icons -->
        <ul class="navbar-nav icons">
          
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="modal" data-target="#sign-out" href="/TRMSLogOutServlet">
              <i class="fa fa-sign-out"></i> Sign Out
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- end of nav -->

  <!-- main content main menu -->

  <div class="container-fluid">
    <div class="row">
      <nav class="col-md-3 col-lg-2 d-none d-md-block sidebar right-padding max-viewport">
        <a class="navbar-brand py-3" href="#">
          <h3 class="text-warning">Main</h3>
       
        </a>
        <hr />
        <ul class="navbar-nav flex-column">
          <li class="nav-item text-uppercase text-muted">Main Menu</li>
            <li class="nav-item">
            <a class="nav-link " href="EmployeeControllerServlet2">View/Edit Your Personal Account Information</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="ReimbursementControllerServlet2">View/Edit Your Pending/Completed Reimbursement Requests</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="ReimbursementControllerServlet">View All Reimbursement Requests in DataBase</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="EmployeeControllerServlet">View All Employees in Database</a>
          </li>
        </ul>
        <ul class="navbar-nav flex-column">
        </ul>
      </nav>
      <!-- end of side bar -->
      <div class="col-md-9 col-lg-10 py-5 bg-light">
        <!-- title row -->
        <div class="row mb-5">
          <div class="col">
            <h3>
              <span class="text-uppercase text-danger">Manager Dashboard /</span><span class="text-muted small"> My
                Dashboard</span>
            </h3>
          </div>
        </div>
        <!-- end of title row -->
        <!-- cards row -->

        <div class="row inform-card">
          <div class="col-lg-3 col-md-6 col-10 mx-auto my-5">
            <div class="card card-1">
              <div class="card-body">
                <div class="flex d-flex justify-content-between">
                  <i class="fa fa-home body-icon"></i>
                  <div class="side-text align-self-center">
                    <h3>20 NEW</h3>
                    <h5>Orders</h5>
                  </div>
                </div>
              </div>
              <div class="card-footer d-flex justify-content-between">
                <a href="#">Learn More</a> <i class="fa fa-refresh"></i>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-10 mx-auto my-5">
            <div class="card card-2">
              <div class="card-body">
                <div class="flex d-flex justify-content-between">
                  <i class="fa fa-users body-icon"></i>
                  <div class="side-text align-self-center">
                    <h3>20 NEW</h3>
                    <h5>Users</h5>
                  </div>
                </div>
              </div>
              <div class="card-footer d-flex justify-content-between">
                <a href="#">Learn More</a> <i class="fa fa-refresh"></i>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-10 mx-auto my-5">
            <div class="card card-3">
              <div class="card-body">
                <div class="flex d-flex justify-content-between">
                  <i class="fa fa-envelope  body-icon"></i>
                  <div class="side-text align-self-center">
                    <h3>20 NEW</h3>
                    <h5>Messages</h5>
                  </div>
                </div>
              </div>
              <div class="card-footer d-flex justify-content-between">
                <a href="#">Learn More</a> <i class="fa fa-refresh"></i>
              </div>
            </div>
          </div>
          <div class="col-lg-3 col-md-6 col-10 mx-auto my-5">
            <div class="card card-4">
              <div class="card-body">
                <div class="flex d-flex justify-content-between">
                  <i class="fa fa-suitcase  body-icon"></i>
                  <div class="side-text align-self-center">
                    <h3>20 NEW</h3>
                    <h5>Orders</h5>
                  </div>
                </div>
              </div>
              <div class="card-footer d-flex justify-content-between">
                <a href="#">Learn More</a> <i class="fa fa-refresh"></i>
              </div>
            </div>
          </div>
        </div>

        <!-- end of cards row -->
        <!-- charts -->
        <div class="row">
          <div class="col-md-6 col-lg-4 my-5">
            <div class="card">
              <div class="card-title text-center">
                <h1 class="text-uppercase">Line Chart</h1>
              </div>
              <canvas id="line-chart"></canvas>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 my-5 mx-auto order-3 order-lg-2">
            <div class="card">
              <div class="card-title text-center">
                <h1 class="text-uppercase">Doughnut Chart</h1>
              </div>
              <canvas id="doughnut-chart"></canvas>
            </div>
          </div>
          <div class="col-md-6 col-lg-4 my-5 order-2 order-lg-3">
            <div class="card">
              <div class="card-title text-center">
                <h1 class="text-uppercase">Bar Chart</h1>
              </div>
              <canvas id="bar-chart"></canvas>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- The Modal -->
  <div class="modal fade" id="sign-out">
    <div class="modal-dialog">
      <div class="modal-content">
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Already want to leave?</h4>
          <button type="button" class="close" data-dismiss="modal">
            &times;
          </button>
        </div>

        <!-- Modal body -->
        <div class="modal-body">
          It is sad to see you go. Please Press Logout to leave.
        </div>

        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal">
            Stay Here
          </button>
          <a href="TRMSLogOutServlet"><button type="button" class="btn btn-danger">
            Logout
          </button></a>
        </div>
      </div>
    </div>
  </div>

  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>

  <!-- chart js -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
  <!-- line chart -->
  <script src="line.js"></script>
  <!-- bar-chart -->
  <script src="bar.js"></script>
  <!-- doughnut-chart -->
  <script src="doughnut.js"></script>

  <!-- toggler button -->
  <script>
    $(".navbar-toggler").html(
      '<i class="fa fa-arrow-down fa-3x text-success"></i>'
    );
  </script>
</body>

</html>