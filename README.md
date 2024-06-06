## ReviewHub
This is a web application for restaurant and businesses review.

### Built with
- Spring Boot
- MyBatis
- MySQL
- Redis

### Functionality
- User login and logout.
- Search for nearby businesses, view details, and check out comments.
- Flash sales for coupons
- Browse and publish store review blog posts.
- User following and feed stream.

### Feature
- Integrated Redis, ThreadLocal and interceptors for authentication and maintaining user login status.
- Enhanced data access speed by caching data with Redis, and achieving cache consistency through proactive updates and time-to-live setting.
- Resolved cache penetration using null-value method and solved cache breakdown using logical expiration.
- Realized flash sales with Redisson distributed lock and Lua scripts.
- Constructed feed stream system with Push Mode.

### Implementation Details
**Authentication:**
For possible cluster situation, since multiple servers does not share session,  I use Redis instead of traditional session to store user information.
All requests will intercepted by `RefreshTokenInterceptor` , while the requests that need authentication are intercepted by `LoginInterceptor` .

**Shop Distance Calculating:**
Redis Geospatial data structure.

**Cache Updating Strategy:**
Mainly cache aside mehod with Time-To-Live for cache data as backup.

**Cache Problems:**
Cache penetration solution:  null-value.
Cache avalanche solution: randomized TTL.
Cache breakdown solution:  logical expiration.

**Flash Sale:**
Solve oversaling problem with optimistic locking.
Ensure one person one order by pessimistic locking with distributed lock and Lua scripts.

**Feed Stream:**
Use Push mode to actively pushes updates to followers.