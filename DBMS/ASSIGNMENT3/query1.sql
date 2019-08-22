/* Assignment 2*/


/*Display the list of products (Id, Title, Count of Categories) which fall in more than one Categories.
*/   
   
SELECT product_id AS ID,
       product_name AS Title,
       count(product_id) AS "Count Of Category"
       FROM product GROUP BY product_id HAVING count(product_id)>1;
       
       
/*Display Count of products as per below price range:*/
SELECT '0-1000' AS "Range In RS." ,count(price) FROM product WHERE price BETWEEN 0 AND 10000
UNION 
SELECT '1000-10000' ,count(price) FROM product WHERE price BETWEEN 1000 AND 10000
UNION
SELECT 'Above 10000',count(price) FROM product WHERE price>10000;

/*Display the Categories along with number of products under each category.*/

SELECT category.category_name AS "Category Title",
       count(product.product_name) AS "Number Of Product"
       FROM category INNER JOIN product
       ON category.category_id=product.category_id 
       GROUP BY category.category_name;
       
       
       
       
       
       
/* Assignment 3*/

 /*Display Shopper’s information along with number of orders he/she placed during last 30 days.*/
 
SELECT user.user_id,
       user.name,
       user.email_id,
       COUNT(orders.order_id) 
       FROM user,orders where user.user_id=orders.user_id AND DATEDIFF(CURDATE(),orders.order_date)<=30 GROUP BY orders.user_id;

/*Display the top 10 Shoppers who generated maximum number of revenue in last 30 days.*/ 
SELECT user.name 
       FROM user INNER JOIN orders ON user.user_id=orders.user_id  
WHERE DATEDIFF(CURDATE(),orders.order_date)<=30
ORDER BY SUM(orders.total_price) DESC LIMIT 10;

/*Display top 20 Products which are ordered most in last 60 days along with numbers. */
SELECT product.product_name,
       COUNT(orderedProducts.product_id) 
       FROM  product
       INNER JOIN orderedProducts ON product.product_id=orderedProducts.product_id
       INNER JOIN orders ON orderedProducts.order_id=orders.order_id
       WHERE DATEDIFF(CURDATE(),orders.order_date)<=60
GROUP BY product.product_id 
DESC LIMIT 20;

/*Display Monthly sales revenue of the StoreFront for last 6 months. It should display each month’s sale. */
SELECT MONTH(orders.order_date) AS month,
       SUM(orders.total_price) AS sales_revenue
       FROM  orders 
       WHERE TIMESTAMPDIFF(MONTH,order_date,CURDATE())<=6  
       GROUP BY month;

/*Mark the products as Inactive which are not ordered in last 90 days */
UPDATE product 
       INNER JOIN orderedProducts 
       ON product.product_id=orderedProducts.product_id
       INNER JOIN orders ON orders.order_id=orderedProducts.product_id      
       SET product.status='inactive' where DATEDIFF(CURDATE(),orders.order_date) >=90 ;

 
/*Display top 10 Items which were cancelled most.
*/
SELECT product.product_id,product.product_name AS "Product Title",
       count(status.product_id) AS CancelTimes,
       status.status
       FROM product INNER JOIN status
       ON status.product_id=product.product_id 
       GROUP BY status.product_id HAVING status.status='cancled'
       ORDER BY CancelTimes DESC LIMIT 10;


 /*Given a category search keyword, display all the Products present in this category/categories. */
/* Category must be Parent */ 
SELECT product.product_id AS ID,
       product.product_name AS Title
       FROM product WHERE product.category_id IN(
           SELECT category_id AS ID FROM category 
           WHERE parent_id = (SELECT category_id 
           FROM category WHERE category_name='Clothes')
       )
       
       
       
       
       
 /* ASSSIGNMENT4 */

CREATE TABLE zipcode
(
    zipcode INT NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    PRIMARY KEY(zipcode)
);

INSERT INTO zipcode VALUES
(313001, 'Udaipur', 'Rajasthan'),
(302019, 'Jaipur', 'Rajasthan'),
(302020, 'Jaipur', 'Rajasthan'), 
(302021, 'Jaipur', 'Rajasthan');

SELECT zipcode, city, state
FROM zipcode
ORDER BY state, city;



/* ASSSIGNMENT5 */


CREATE VIEW orderInformation AS
SELECT orders.order_id,
       orders.total_price,
       user.name,
       user.email_id,
       orders.order_date,
       status.status
       FROM orders INNER JOIN user ON orders.user_id=user.user_id
       JOIN status ON status.order_id=orders.order_id
       WHERE orders.order_date > DATE_SUB(CURDATE(),INTERVAL 60 DAY)
       ORDER BY orders.order_id DESC;
 
select * from orderInformation;
 
 
select order_id from orderInformation where status='shipped';

select order_id AS Product from orderInformation GROUP BY order_id ORDER BY
Product DESC LIMIT 5;
