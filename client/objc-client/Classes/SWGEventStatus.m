#import "SWGDate.h"
#import "SWGEventStatus.h"

@implementation SWGEventStatus

-(id)yesCount: (NSNumber*) yesCount
    maybeCount: (NSNumber*) maybeCount
    noCount: (NSNumber*) noCount
    invitedCount: (NSNumber*) invitedCount
{
  _yesCount = yesCount;
  _maybeCount = maybeCount;
  _noCount = noCount;
  _invitedCount = invitedCount;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _yesCount = dict[@"yesCount"]; 
        _maybeCount = dict[@"maybeCount"]; 
        _noCount = dict[@"noCount"]; 
        _invitedCount = dict[@"invitedCount"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_yesCount != nil) dict[@"yesCount"] = _yesCount ;
        if(_maybeCount != nil) dict[@"maybeCount"] = _maybeCount ;
        if(_noCount != nil) dict[@"noCount"] = _noCount ;
        if(_invitedCount != nil) dict[@"invitedCount"] = _invitedCount ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

