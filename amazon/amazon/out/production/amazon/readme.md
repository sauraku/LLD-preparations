+ users should be able to add new products to item to sell
+ user should be able to search for products by name or category
+ user needs to be registered to buy the product
+ user can checkout items in cart
+ user can rate and review products
+ user should be notified when the order status changes
--------------------


Product
-----------
+ id: string
+ price: float
+ name: string
+ category: ProductCategory
+ comments: List<Comment>
-----------------------


Comment
-----
+ comment: string
+ userID: string

Item
--------------
+ product: Product
+ quantity: int
-------------------

ProductCategory
--------------------
+ categories: enum
-----------------------

Address
------------------
+ name: string
+ addressLine: string
+ city: string
+ country: string
+ pincode: int
+ phoneNo: int
--------------------



Cart
----------------
+ items: List<Item>
-------------------------
+ getTotalPrice(): totalPrice: float
+ addItem(item: Item): void
+ removeItem(item: Item): void
+ checkout(address:Address): order: Order
----------------------------------------

Order
-------------------
+ items: List<Item>
+ totalPrice: float
+ userID: string
+ status: OrderStatus
--------------
+ notifyOnStatusChange()
----------------------


OrderStatus
--------------------
+ status: enum
-----------------------


User[Abstract]
-------------------
+ userID: string
+ cart: Cart
-----------------------
+ search()
+ addToCart(item: Item)
+ removeFromCart(item: Item)
---------------------


Buyer(User)
----------------------
+ address: List<Address>
----------------------
+ checkout()
+ comment(product: Product)
--------------------------

Seller(Buyer)
---------------
+ itemOnSale: List<Item>
-------------------
+ addItem(item:Item)
+ removeItem(item:Item)
+ updateItem(item:Item)
-----------------------------

Visitor(User)
----------
+ cookie:string
-----------


NotificationService
--------------------
+ subscriber: Map<order, List<NotificationSubscriber>>
---------------------
+ notify(order:Order)
-------------------

NotificationSubscriber[interface]
------------------
-----------------
+ triggerNotification()
-----------------

EmailNotificationSubscriber(NotificationSubscriber)
-------------
+ triggerNotification()
--------------

SMSNotificationSubscriber(NotificationSubscriber)
-------------
+ triggerNotification()
--------------

WhatsappNotificationSubscriber(NotificationSubscriber)
-------------
+ triggerNotification()
--------------

AmazonApp
----------------------
+ products: List<Product>
----------
+ processOrder(order: Order)
+ searchProduct(queryString: String): List<Product>
+ handleComment(comment: string, user: Buyer)











