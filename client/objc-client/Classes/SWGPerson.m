#import "SWGDate.h"
#import "SWGPerson.h"

@implementation SWGPerson

-(id)_id: (NSNumber*) _id
    username: (NSString*) username
    firstname: (NSString*) firstname
    lastname: (NSString*) lastname
{
  __id = _id;
  _username = username;
  _firstname = firstname;
  _lastname = lastname;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        __id = dict[@"id"]; 
        _username = dict[@"username"]; 
        _firstname = dict[@"firstname"]; 
        _lastname = dict[@"lastname"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(__id != nil) dict[@"id"] = __id ;
        if(_username != nil) dict[@"username"] = _username ;
        if(_firstname != nil) dict[@"firstname"] = _firstname ;
        if(_lastname != nil) dict[@"lastname"] = _lastname ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

