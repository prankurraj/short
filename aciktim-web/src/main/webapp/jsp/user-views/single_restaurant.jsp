<%@include file="../sub-element/jsp_imports.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <%@include file="../sub-element/imports.jsp" %>
    <link rel="stylesheet" type="text/css" href="${contextPath}/assets/custom_style/home-index-style.css"/>
</head>
<body>
<div class="container" id="main-container">


    <c:if test="${full_name == ''}">
        <%@include file="../sub-element/header_signed_out.jsp" %>
    </c:if>
    <c:if test="${full_name != ''}">
        <%@include file="../sub-element/header_signed_in.jsp" %>
    </c:if>

    <%@include file="../sub-element/content_bar_restaurant.jsp" %>



    <div class="row">
        <div class="col-md-3">

            <div class="row">
                <!-- change the dummy link -->
                <img src="http://placehold.it/240x320" class="img-rounded center-block" width="240" height="320">
            </div>
            <div class="row">
                <h4 class="text-center">${restaurant_name}</h4>
            </div>
        </div>

        <div class="col-md-9">
            <div class="row">
                <h3>Menus</h3>
            </div>

            <div class="row">
                <div class="col-sm-12">
                    <table class="table table-bordered" style="margin-top:10px;">
                        <thead>
                            <th>Name</th>
                            <th>Recipes</th>
                        </thead>
                        <tbody>
                            <c:forEach var="menu" items="${restaurantMenus}" varStatus="roop">
                                <tr>
                                    <td> ${menu.name} </td>
                                    <td>
                                        <table class="table" style="margin-top:10px;">
                                            <c:forEach var="recipe" items="${menu.recipes}" varStatus="roop">
                                                <tr>
                                                    <td>${recipe.name}</td>
                                                    <td>
                                                        <form class="form-horizontal row-border" action="${contextPath}/recipe/single"
                                                              method="post">
                                                            <input type="hidden" name="recipe_id" value="${recipe.id}"/>
                                                            <button type="submit" class="btn btn-default pull-right"
                                                                    style="text-transform: capitalize">View</button>
                                                        </form>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </table>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-12">
                    <div class="row">
                        <h3>Recipes</h3>
                    </div>

                    <table class="table table-bordered" style="margin-top:10px;">
                        <thead>
                        <th>Picture</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>View</th>
                        </thead>
                        <tbody>
                        <c:forEach var="recipe" items="${restaurantRecipes}" varStatus="roop">
                            <tr>
                                <td>
                                    <img src="${recipe.pictureAddress}" class="img-rounded center-block" width="240">
                                </td>
                                <td width="20%">${recipe.name}</td>
                                <td width="60%">${recipe.description}</td>
                                <td>
                                    <form class="form-horizontal row-border" action="${contextPath}/recipe/single">
                                        <input type="hidden" name="recipe_id" value="${recipe.id}"/>
                                        <button type="submit" class="btn btn-default" style="text-transform: capitalize">View</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

    </div>


    <%@include file="../sub-element/footer.jsp" %>

</div>


</body>

<script>
    $(document).ready(function () {

    });


</script>

</html>
