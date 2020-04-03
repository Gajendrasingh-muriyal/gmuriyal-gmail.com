# gmuriyal-gmail.com
CardManagement

Cart Managemnt system

Card Management System
-----------------------

Card Management System helps to raise request for new card or report lost/stolen card.

 

•   
 When the customer raise new card request, application should generate 12-digit card number, expiry date and cvv number with Customer name. 
•   
 Customer can raise request for reissue and blocking current active card with Card number and reason for blocking(Lost/Stolen/Damaged). 
    o   
 Once request is placed, system has to block the card with status as ‘blocked’ for provided card number.
   
 o    If Customer wish to opt for reissue card then it will be same as new card request.
Eg: {12- digit card number, reason, reissue(Y/N)}

//new card 
 

Note:     
- Presuming Customer is already registered in the system with or without existing cards.
- CVV(3 digit number)
- Card Number (12 digit number)
 Eg: 7777-8888-9999

 

Good to have:
- Card numbers should be masked in response (54XX-XXXX-XX87) for viewing existing cards
- 
Sending notification about card requests(blocked/reissue/new)

Assumptions:

Description:


Database:
==============
Table Name: Customer:
customerId:-->pk
customername:
lastname:
username:
email:
mobileno:
//--cardno:


Table Name: CardDetails
cardId:--pk
cardno-->12 digit no.
expiredate:
cvvno:
customerId:-->Fk
customername:
cardstatus:
reason:
cardtype:
reissue:



TableName:



EndPointURL:
==============
Request:
createnewcard:

Url: cratecard



Response:

{
cardno-->12 digit no.
expiredate;
cvvno;
cardstatus:




}

reissueing card:
Url:updatecard/{customerId}/{cardId}


Response:
{
cardno-->new card no 12 digit no.//create new card along with block the existing card of the customer.
expiredate:
cvvno:
cardstatus://should have card status along with below reason
reason
cardtype:
reissue:


}

insert into CUSTOMER Values ('111', 'gane@gamil.com','1234567890','Gajendra');




