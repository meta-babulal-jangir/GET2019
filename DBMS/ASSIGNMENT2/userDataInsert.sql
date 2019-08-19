show tables;    

INSERT INTO user (
                name,
                password,
                date_of_birth,
                gender,
                user_type,
                email_id
        ) 
        VALUES (
                'Ramesh Kumar Sharma',
                '1234',
                '1998-01-02',
                'm',
                'shopper',
                'ramesh@gmail.com'
    );    
INSERT INTO user(
                name,
                password,
                date_of_birth,
                gender,
                user_type,
                email_id
        ) 
	VALUES(
                'Reena Kumari Sharma',
                '2345',
                '1997-11-02',
                'f',
                'shopper',
                'reenasharma@gmail.com'
    );    
INSERT INTO user(
    		name,
    		password,
    		date_of_birth,
    		gender,
    		user_type,
    		email_id
    		) 
	VALUES(
    		'Ankit Jaishwal',
    		'4567',
    		'1998-11-15',
    		'm',
    		'shopper',
    		'ankit@gmail.com'
    );    
INSERT INTO user(
    		name,
    		password,
    		date_of_birth,
    		gender,
    		user_type,
    		email_id
    		) 
	VALUES(
    		'Nitesh Kumar',
    		'347695',
    		'1995-12-12',
    		'm',
    		'shopper',
    		'nitesh@gmail.com'
    );    
INSERT INTO user(
    		name,
    		password,
    		date_of_birth,
    		gender,
    		user_type,
    		email_id
    		) 
	VALUES(
    		'Mukesh Kumar',
    		'34567',
    		'1996-03-12',
    		'm',
    		'admin',
    		'mukeshkumar@gmail.com'
    );   



INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    1,
                    '1 LalKothi',
                    'Jaipur',
                    'Rajasthan',
                    '331112'
                    );
INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    2,
                    '21 Gandhipath',
                    'Jaipur',
                    'Rajasthan',
                    '334220'
                    );
INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    3,
                    '20 Gandhipath',
                    'Jaipur',
                    'Rajasthan',
                    '335220'
                    );
INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    4,
                    '45 Gandhipath',
                    'Jaipur',
                    'Rajasthan',
                    '331820'
                    );
INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    4,
                    '78 Nagar Nigam',
                    'Jaipur',
                    'Rajasthan',
                    '331227'
                    );
INSERT INTO address(
                    user_id,
                    street,
                    city,
                    state,
                    pin_code
                    ) 
			 VALUES(
                    4,
                    '29 Gandhipath',
                    'Jaipur',
                    'Rajasthan',
                    '331280'
                    );
                     

INSERT INTO category(
                    category_name,
                    parent_id
                    ) 
			 VALUES(
                    'Clothes',
                    0
                    );
INSERT INTO category(
                    category_name,
                    parent_id
                    ) 
			 VALUES(
                    'T-shirt',
                    1
                    );
INSERT INTO category(
                    category_name,
                    parent_id
                    ) 
			 VALUES(
                    'Electronic',
                    0
                    );
INSERT INTO category(
                    category_name,
                    parent_id
                    ) 
			 VALUES(
                    'Mobile',
                    3
                    );

INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   1,
								   '7845124578'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   2,
								   '8965245758'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   2,
								   '7875124578'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   3,
								   '7889784578'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   4,
								   '7845235678'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   5,
								   '7845124456'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   4,
								   '9987824578'
								);
INSERT INTO contact_number_of_user(
                                   user_id,
                                   contact_number
                                  ) 
			               VALUES(
                                   3,
								   '7845855278'
								);




INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 2,
    		'Reebok T-Shirt M',
    		999,
    		'Medium size T-shirt, Red Color',
    		100
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 2,
    		'Reebok T-Shirt L',
    		999,
    		'Large size T-shirt, Black Color',
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
    		 2,
    		'Reebok T-Shirt XL',
    		1299,
    		'Extra Large size T-shirt, Blue Color',
    		50
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Vivo Z1 Pro',
    		14990,
    		'4GB,64GB , Red Color',
    		1000
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Vivo Z1 Pro',
    		14990,
    		'4GB,64GB , Black Color',
    		2000
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Vivo Z1 Pro',
    		16990,
    		'6GB,64GB , Black Color',
    		800
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Vivo Z1 Pro',
    		17990,
    		'6GB,128GB , Red Color',
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
    		 4,
    		'Vivo Z1 Pro',
    		17990,
    		'6GB,128GB , Black Color',
    		300
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Redmi Note 7 Pro',
    		13999,
    		'4GB,64GB , Blue Color',
    		1000
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Redmi Note 7 Pro',
    		13999,
    		'4GB,64GB , Black Color',
    		2000
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
    		'Redmi Note 7 Pro',
    		15999,
    		'6GB,128GB , Blue Color',
    		50
    );
INSERT INTO product(
    		category_id,
    		product_name,
    		price,
    		description,
    		stock
    		) 
	VALUES(
    		 4,
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
    		 4,
    		'Honor 10 Lite',
    		12999,
    		'4GB,64GB , Gold Color',
    		10
    );
    
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 1,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 1,
    		'mywebsite/img2.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 1,
    		'mywebsite/img3.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 3,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 3,
    		'mywebsite/img2.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 4,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 5,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 5,
    		'mywebsite/img2.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 6,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 7,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 8,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 10,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 10,
    		'mywebsite/img2.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 10,
    		'mywebsite/img3.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 10,
    		'mywebsite/img4.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 11,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 12,
    		'mywebsite/img1.jpg'
    );
INSERT INTO product_image(
    		product_id,
    		image_url
    		) 
	VALUES(
    		 12,
    		'mywebsite/img1.jpg'
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       1,
    		 1,
    		'2019-08-18',
            '2019-08-20',
            999
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       2,
    		 2,
    		'2019-07-18',
            '2019-07-20',
            999
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       3,
    		 3,
    		'2019-07-19',
            '2019-07-21',
            1998
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       4,
    		 4,
    		'2019-08-11',
            '2019-08-15',
            1299
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       4,
    		 4,
    		'2019-08-16',
            '2019-08-20',
            2598
    );
INSERT INTO orders(
      user_id,  
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       4,
    		 6,
    		'2019-08-16',
            '2019-08-18',
            14990
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       4,
    		 6,
    		'2019-08-11',
            '2019-08-25',
            29980
    );
INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       1,
    		 1,
    		'2019-08-13',
            '2019-08-16',
            17990
    );
 INSERT INTO orders(
      user_id,
    		address_id,
    		order_date,
            delivery_date,
            total_price
    		) 
	VALUES(
       1,
    		 1,
    		'2019-08-19',
            '2019-08-21',
            15989
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 1,
    		 1,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 2,
    		 2,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 3,
    		 2,
             2
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 4,
    		 3,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 5,
    		 3,
             2
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 6,
    		 4,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 7,
    		 5,
             2
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 8,
    		 7,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 9,
    		 1,
             1
    );
INSERT INTO orderedProducts(
    		order_id,
    		product_id,
            quantity
    		) 
	VALUES(
    		 9,
    		 4,
             1
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 1,
       1,
    		 'Not Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 2,
       2,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 3,
       2,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 4,
       3,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 5,
       3,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 6,
       4,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 7,
       5,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
    		) 
	VALUES(
    		 8,
       7,
    		 'Shipped'
    );
INSERT INTO status(
    		order_id,
      product_id,
    		status
      ) 
	VALUES(
    		 9,
       1,
    		 'Shipped'
    );
 
 INSERT INTO status(
    		order_id,
      product_id,
    		status
      ) 
	VALUES(
    		 9,
       4,
    		 'Shipped'
    );