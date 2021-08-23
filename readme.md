###### **Music purchase App**

A command line application that allows the selection of a song(s) to purchase using a UI.

---------------------------------------------------------------

**Statement of Purpose**

What does the application do?
the goal of my micro service is to simply allow a user to choose from a preset list of songs then proceed to a checkout which will take a mock payment via email and card input.

---------------------------------------------------------------

**What business problem does this address?**

With the ease of access to music production software a lot of musicians can have trouble earning an income from distributors who take a portion of the income or from online streaming services who pay a few dollars per thousand plays. This application will allow the selling of ones music without the distributors tax and allow fans to support this with purchases directly from the artist(s).

---------------------------------------------------------------

**Features:**
1. User is greeted and shown a display of songs.

2. User can input into command line for the song they want and decide if they want to proceed to checkout or choose a different song.

3. User is greeted with the checkout screen that requires the input of their email for delivery of product and a mock card payment input for payment. 

-------------------------------------------------------------

**Implementation**
The initial step of creating this application was brainstorming the general structure.

From there i create new packages: the controller, model, ProductServices and Repository.
Once these are done the ProductControl is created along with Product under model and ProductRepository. 
Once that is completed the ProductService interface is created and the ProductServiceImpl. 
Finally the CardPaymentForm is created under model. 

The creation of the HTML displays is done using bootstrap. 
First is the creation of the HomePage.html which features the soundcloud Embeded Player API. 
I also used a preset button checkbox in allocation of the songs to allow the user to select multiple items for purchases but only once.
following is the PaymentForm.html, which is simply a mock payment UI created with bootstrap. 



