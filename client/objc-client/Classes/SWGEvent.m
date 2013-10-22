#import "SWGDate.h"
#import "SWGEvent.h"

@implementation SWGEvent

-(id)_id: (NSNumber*) _id
    name: (NSString*) name
    startDate: (SWGDate*) startDate
    maxAttendees: (NSNumber*) maxAttendees
{
  __id = _id;
  _name = name;
  _startDate = startDate;
  _maxAttendees = maxAttendees;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        __id = dict[@"id"]; 
        _name = dict[@"name"]; 
        id startDate_dict = dict[@"startDate"];
        if(startDate_dict != nil)
            _startDate = [[SWGDate alloc]initWithValues:startDate_dict];
        _maxAttendees = dict[@"maxAttendees"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(__id != nil) dict[@"id"] = __id ;
        if(_name != nil) dict[@"name"] = _name ;
        if(_startDate != nil){
        if([_startDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *startDate in (NSArray*)_startDate) {
                [array addObject:[(SWGObject*)startDate asDictionary]];
            }
            dict[@"startDate"] = array;
        }
        else if(_startDate && [_startDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_startDate toString];
            if(dateString){
                dict[@"startDate"] = dateString;
            }
        }
        else {
        if(_startDate != nil) dict[@"startDate"] = [(SWGObject*)_startDate asDictionary];
        }
    }
    if(_maxAttendees != nil) dict[@"maxAttendees"] = _maxAttendees ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

