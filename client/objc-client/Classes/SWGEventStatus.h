#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGEventStatus : SWGObject

@property(nonatomic) NSNumber* yesCount;  /* Number of people confirmed to attend [optional]*/

@property(nonatomic) NSNumber* maybeCount;  /* Number of people who may attend [optional]*/

@property(nonatomic) NSNumber* noCount;  /* Number of people who cannot attend [optional]*/

@property(nonatomic) NSNumber* invitedCount;  /* Total number of people invited [optional]*/

- (id) yesCount: (NSNumber*) yesCount
     maybeCount: (NSNumber*) maybeCount
     noCount: (NSNumber*) noCount
     invitedCount: (NSNumber*) invitedCount;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

