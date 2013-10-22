#import <Foundation/Foundation.h>
#import "SWGEvent.h"
#import "SWGEventStatus.h"


@interface SWGEventsApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGEventsApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 adds a new event
 
 @param body event to add
 */
-(NSNumber*) addEventWithCompletionBlock :(SWGEvent*) body 
        completionHandler: (void (^)(SWGEvent* output, NSError* error))completionBlock;

/**

 looks up an event by ID
 
 @param eventId ID of event to look up
 */
-(NSNumber*) findEventByIdWithCompletionBlock :(NSNumber*) eventId 
        completionHandler: (void (^)(SWGEvent* output, NSError* error))completionBlock;

/**

 Removes an event
 
 @param eventId ID of event to look delete
 */
-(NSNumber*) deleteEventWithCompletionBlock :(NSNumber*) eventId 
        completionHandler: (void (^)(SWGEvent* output, NSError* error))completionBlock;

/**

 gets the attendee status of the event
 
 @param eventId ID of event to get status on
 */
-(NSNumber*) getEventStatusWithCompletionBlock :(NSNumber*) eventId 
        completionHandler: (void (^)(SWGEventStatus* output, NSError* error))completionBlock;

@end
