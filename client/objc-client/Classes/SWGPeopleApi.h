#import <Foundation/Foundation.h>
#import "SWGPerson.h"


@interface SWGPeopleApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGPeopleApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 looks up a person by ID
 
 @param personId ID of person to look up
 */
-(NSNumber*) findPersonByIdWithCompletionBlock :(NSNumber*) personId 
        completionHandler: (void (^)(SWGPerson* output, NSError* error))completionBlock;

@end
