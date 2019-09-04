/* Assignment 2*/


/*Display the list of products (Id, Title, Count of Categories) which fall in more than one Categories.
*/   
   
SELECT product.product_id AS ID,
       product.product_name AS Title,
       count(product_category.product_id) AS "Count Of Category"
       FROM product INNER JOIN product_category ON product.product_id=product_category.product_id GROUP BY product_category.product_id HAVING count(product_category.product_id)>1;
       
       
/*Display Count of products as per below price range:*/
SELECT '0-1000' AS "Range In RS." ,count(price) FROM product WHERE price BETWEEN 0 AND 1000
UNION 
SELECT '1000-10000' ,count(price) FROM product WHERE price BETWEEN 1000 AND 10000
UNION
SELECT 'Above 10000',count(price) FROM product WHERE price>10000;

/*Display the Categories along with number of products under each category.*/

SELECT category.category_name AS "Category Title",
       count(product_category.product_id) AS "Number Of Product"
       FROM category INNER JOIN product_category
       ON category.category_id=product_category.category_id 
       GROUP BY product_category.category_id;
       
       
       
       
       
       
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
SELECT product_id  ,product_name,price,description,stock  FROM product AS T1
INNER JOIN (select orderedproducts.product_id As p2 from orderedproducts,orders 
where orderedproducts.order_id=orders.order_id AND DATEDIFF(CURDATE(),orders.order_date)<=60 group by orderedproducts.product_id order by (sum(orderedproducts.quantity))DESC LIMIT 20) AS T2  
 ON T1.product_id=T2.p2;

/*Display Monthly sales revenue of the StoreFront for last 6 months. It should display each month’s sale. */
SELECT MONTH(orders.order_date) AS month,
       SUM(orders.total_price) AS sales_revenue
       FROM  orders 
       WHERE TIMESTAMPDIFF(MONTH,order_date,CURDATE())<=6  
       GROUP BY month;

/*Mark the products as Inactive which are not ordered in last 90 days */

UPDATE product 
       SET product.status='inactive' 
       WHERE product.product_id NOT IN(
       SELECT orderedproducts.product_id  FROM orderedProducts,orders WHERE orders.order_id=orderedproducts.order_id AND DATEDIFF(CURDATE(),orders.order_date) <=90);

 /*Given a category search keyword, display all the Products present in this category/categories. */
SELECT product.product_id AS ID,
       product.product_name AS Title
       FROM product WHERE product.product_id IN(
           SELECT product_category.product_id  FROM product_category 
           WHERE product_category.category_id = (SELECT category_id 
           FROM category WHERE category_name='Mobile')
       )       
       
 /*Display top 10 Items which were cancelled most.*/
SELECT product_id ,product_name,price,description 
       FROM product AS T1 INNER JOIN 
       (SELECT orderedproducts.product_id AS pId2  FROM orderedproducts WHERE orderedproducts.status='Cancelled'
       GROUP BY orderedproducts.product_id ORDER BY (sum(orderedproducts.quantity))DESC LIMIT 20) AS T2 
       ON T1.product_id=T2.pId2;
       
       
       
       
 /* ASSSIGNMENT4 */

CREATE TABLE state_city
(
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    PRIMARY KEY(city)
);


INSERT INTO state_city VALUES
('Udaipur', 'Rajasthan'),
('Jaipur', 'Rajasthan'),
('Sikar', 'Rajasthan'),
('kolkata', 'West Bengal'),
('Agra', 'UP'),
('Shrinagar', 'Jammu'),
('Kanpur', 'UP');

CREATE TABLE zipcode
(
    zipcode INT NOT NULL,
    city VARCHAR(50) NOT NULL,
    PRIMARY KEY(zipcode),
    FOREIGN KEY(city) references state_city(city)
);

INSERT INTO zipcode VALUES
(313001, 'Udaipur'),
(302001, 'Jaipur'),
(332525, 'Sikar'),
(312457, 'Kanpur'),
(313201, 'kolkata'),
(313458, 'Agra'),
(313501, 'Shrinagar');

SELECT zipcode.zipcode, zipcode.city, state_city.state
FROM zipcode INNER JOIN state_city ON state_city.city=zipcode.city
ORDER BY state_city.state, zipcode.city;



/* ASSSIGNMENT5 */

CREATE VIEW orderInformation AS
SELECT orders.order_id AS OrderID,
        orders.total_price AS Price,
        orders.order_date AS OrderDate,
        user.name AS ShopperName,
        user.email_id AS Email,
        orderedProducts.status AS status
        FROM user INNER JOIN orders
        on orders.user_id=user.user_id
        INNER JOIN orderedProducts on 
        orderedProducts.order_id=orders.order_id
        WHERE orders.order_date > DATE_SUB(CURDATE(),INTERVAL 60 DAY)
        ORDER BY orders.order_id DESC;
        
 select orderId from orderInformation where status='shipped';
 
 select orderId AS Product from orderInformation GROUP BY orderId ORDER BY
Product DESC LIMIT 5;



//path    %SystemRoot%\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\