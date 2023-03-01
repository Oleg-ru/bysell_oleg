<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BUSELL</title>
</head>

<body>
<H1>BYSELL</H1><hr>

<h4>подробная информация о товаре:</h4>
<hr>
<b>Название товара: </b>${product.title}<br><br>
<b>Описание товара: </b>${product.description}<br><br>
<b>Стоимость товара: </b>${product.price}<br><br>
<b>Город: </b>${product.city}<br><br>
<b>Автор: </b>${product.author}<br><br>
<h3>Удалить товар</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>