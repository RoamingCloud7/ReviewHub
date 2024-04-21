## ReviewHub
The web application for for restaurant review.

* Implemented features include SMS login, restaurants search and review, flash sales, blog posting and user following.
* Used Redis for user SMS login, with ThreadLocal and interceptors maintaining user login status.
* Utilized Geospatial data structure in Redis to search nearby restaurants.
* Enhanced data access speed by caching data with Redis, and achieving cache consistency through proactive updates and time-to-live setting.
* Realized flash sales and resovled overselling problem with Redisson and Lua scripts.
* Constructed feed stream system with Push Mode.