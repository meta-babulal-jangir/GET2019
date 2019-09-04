ALTER TABLE `store_front`.`product` 
ADD COLUMN `product_counter` INT NOT NULL AUTO_INCREMENT  
AFTER `stock` , CHANGE 
COLUMN `product_id` `product_id` INT(11) NOT NULL  

, DROP PRIMARY KEY 

, ADD PRIMARY KEY (`product_counter`, `product_id`) ;

insert into category(category_name,parent_id) values ('Honor',4);
insert into category(category_name,parent_id) values ('Redmi',4);
    
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 6,
    		'Redmi Note 7 Pro',
    		15999,
    		'6GB,128GB , Black Color',
    		200
    );
    
    
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 5,
    		'Honor 10 Lite',
    		12999,
    		'4GB,64GB , Gold Color',
    		10
    );