#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGPerson : SWGObject

@property(nonatomic) NSNumber* _id;  /* Unique identifier for the person [optional]*/

@property(nonatomic) NSString* username;  /* Username for the person [optional]*/

@property(nonatomic) NSString* firstname;  /* First name for the person [optional]*/

@property(nonatomic) NSString* lastname;  /* Last name for the person [optional]*/

- (id) _id: (NSNumber*) _id
     username: (NSString*) username
     firstname: (NSString*) firstname
     lastname: (NSString*) lastname;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

