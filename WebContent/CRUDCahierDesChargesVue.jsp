<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="">

<title>Album example for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/sticky-footer-navbar.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="album.css" rel="stylesheet">
</head>

<body>

	<header>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<a class="navbar-brand" href="#">Fixed navbar</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarCollapse" aria-controls="navbarCollapse"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
					</li>
				</ul>
				<form class="form-inline mt-2 mt-md-0">
					<input class="form-control mr-sm-2" type="text"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
	</header>

	<main role="main">

	<div class="album py-5 bg-light">
		<div class="container">
			<div class="row pt-5">
				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<form action= "CreateServlet" method="post" class="card-body" onsubmit="return validate()">
							<p class="card-text">
								Type de site :<input type="text" name="typeSite"
									class="form-control w-75" id="typeSite" placeholder="" value="">
							</p>
							<p class="card-text">
								Taille entreprise :<input type="text" name="tailleEntreprise"
									class="form-control w-75" id="tailleEntreprise" placeholder=""
									value="">
							</p>
							<p class="card-text">
								Fonctionnalités :<input type="text" name="fonctionnalites"
									class="form-control w-75" id="fonctionnalites" placeholder=""
									value="">
							</p>
							<p class="card-text">
								Type licence :<input type="text" name="typeLicence"
									class="form-control w-75" id="typeLicence" placeholder=""
									value="">
							</p>
							<div class="d-flex justify-content-center">
								<button type="submit" class="btn btn-sm btn-outline-secondary">Créer</button>
							</div>
						</div>
					</div>
				</div>
				<!--  début carte -->
				<jsp:include page="CRUDCahierDesChargesControleur.jsp"></jsp:include>
				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<div class="card-body">
							<p class="card-text">
								Type de site :<input type="text" name="typeSite"
									class="form-control w-75" id="typeSite"
									placeholder="<%=(session.getAttribute("typeSite") == null) ? "" : session.getAttribute("typeSite")%>"
									value="<%=(session.getAttribute("typeSite") == null) ? "" : session.getAttribute("typeSite")%>">
							</p>
							<p class="card-text">
								Taille entreprise :<input type="text" name="tailleEntreprise"
									class="form-control w-75" id="tailleEntreprise"
									placeholder="<%=(session.getAttribute("tailleEntreprise") == null) ? "" : session.getAttribute("tailleEntreprise")%>"
									value="<%=(session.getAttribute("tailleEntreprise") == null) ? "" : session.getAttribute("tailleEntreprise")%>">
							</p>
							<p class="card-text">
								Fonctionnalités :<input type="text" name="fonctionnalites"
									class="form-control w-75" id="fonctionnalites"
									placeholder="<%=(session.getAttribute("fonctionnalites") == null) ? "" : session.getAttribute("fonctionnalites")%>"
									value="<%=(session.getAttribute("fonctionnalites") == null) ? "" : session.getAttribute("fonctionnalites")%>">
							</p>
							<p class="card-text">
								Type licence :<input type="text" name="typeLicence"
									class="form-control w-75" id="typeLicence"
									placeholder="<%=(session.getAttribute("typeLicence") == null) ? "" : session.getAttribute("typeLicence")%>"
									value="<%=(session.getAttribute("typeLicence") == null) ? "" : session.getAttribute("typeLicence")%>">
							</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Modifier</button>
									<button type="button" class="btn btn-sm btn-outline-secondary">Supprimer</button>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--  fin carte -->
			</div>

		</div>
	</div>
	</main>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="../../assets/js/vendor/popper.min.js"></script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<script src="../../assets/js/vendor/holder.min.js"></script>
</body>
</html>
