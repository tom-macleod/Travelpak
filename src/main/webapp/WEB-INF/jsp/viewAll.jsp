<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h1 class="text-center lobster large-title">All Vacations</h1>

<c:forEach var="vacation" items="${vacations}">

	<p>Id - ${vacation.vacationId}</p><br>
	<p>Location - ${vacation.location}</p><br>
	<p>Country - ${vacation.country}</p><br>
	<p>Description - ${vacation.description}</p><br>
	<p>Duration - ${vacation.duration} days</p><br>
	<p>Price - $${vacation.price}</p><br>
	<p>Accommodation Provided - ${vacation.accommodation}</p><br>
	
</c:forEach>



<c:import url="/WEB-INF/jsp/footer.jsp" />