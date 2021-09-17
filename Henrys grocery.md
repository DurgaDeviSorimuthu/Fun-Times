## Task
A local shop, Henry’s Grocery, has asked you to author an IT solution for them to price up a basket of shopping for their customers.

Create a fork and share with me.

Henry’s Grocery, currently only stocks four items and has two promotions. These are as follows:

  - _Stock Items_
        
    |  `product` | `unit`   | `cost` |
    | :---  | :---: | :---: |
    |  soup    | tin    | 0.65 |
    |  bread   | loaf   | 0.80 |
    |  milk    | bottle | 1.30 |
    |  apples  | single | 0.10 |

  - _Discounts_
 
    | `the offer` | `valid from` | `valid to` | 
    | :---     | :---: | :---: |    
    | Buy 2 tins of soup and get a loaf of bread half price | yesterday | for 7 days |
    | Apples have a 10% discount | from 3 days hence | until the end of the following month |

  - _Inputs_
    - All basket items added via the command prompt.
  - _Outputs_
    -	All outputs must print to the command line.
     
  - _Tests_
     - Price a basket containing: 3 tins of soup and 2 loaves of bread, bought today, 
       - Expected total cost = 3.15;
     - Price a basket containing: 6 apples and a bottle of milk, bought today, 
       - Expected total cost = 1.90;
     - Price a basket containing: 6 apples and a bottle of milk, bought in 5 days time,
       - Expected total cost = 1.84;
     - Price a basket containing: 3 apples, 2 tins of soup and a loaf of bread, bought in 5 days time,
       - Expected total cost = 1.97.
          
## Hints
 - This is an opportunity for you to show _all_ of your [software engineering](https://en.wikipedia.org/wiki/Software_engineering) skills.
 - Develop using the agile methodology.
 - Think about code metrics.
 - Please try to keep it simple.
 - We expect you to spend no more than 2 to 3 hours of your time, so don't feel you need to complete it. Good luck!
 - How would you enhance your solution so that the store own could add and remove: products; or offers?

## Tooling
You must use:
 - Java JDK 8. _We are currently using [open JDK 8u181](https://cdn.azul.com/zulu/bin/zulu8.31.0.1-jdk8.0.181-win_x64.msi)_
 - Please use version control, prefererable _GIT_
 - A recognised build tool, e.g. _gradle_, _maven_...
 
 All other tools must be freely available. Any third-party jars must be accessible via [maven central](https://mvnrepository.com/repos/central).
