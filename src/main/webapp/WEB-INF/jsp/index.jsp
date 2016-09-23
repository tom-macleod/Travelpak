<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
	
<div class="row">
	<div class="col-sm-1"></div>
	<div class="col-sm-10">
		<div id="index_background">
			<h1 class="text-center lobster large-title">Travelpak</h1>
		</div>	
	</div>
	<div class="col-sm-1"></div>
</div>	
	<br><br>
	<p class="text-center">Search for a location below or use the navigation bar above to find a perfect winter vacation.</p>
	<br>
	<div class="text-center alert alert-info">
		<form action="#" method="GET">
			<label>Search Location <br><input class="text-fade" type="text" name="s" placeholder="Japan..." /></label>
			<br><br>
			<button class="btn btn-primary" type="submit">Search</button>
		</form>
	</div>
	<br><br><br><br>
<c:import url="/WEB-INF/jsp/footer.jsp" />