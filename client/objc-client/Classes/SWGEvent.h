#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGEvent : SWGObject

@property(nonatomic) NSNumber* _id;  /* Unique identifier for the event [optional]*/

@property(nonatomic) NSString* name;  /* Friendly name for the event [optional]*/

@property(nonatomic) SWGDate* startDate;  /* Date & Time that the event begins [optional]*/

@property(nonatomic) NSNumber* maxAttendees;  /* number of people who can attend [optional]*/

- (id) _id: (NSNumber*) _id
     name: (NSString*) name
     startDate: (SWGDate*) startDate
     maxAttendees: (NSNumber*) maxAttendees;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

