//
//  main.m
//  Sample
//
//  Created by Tony Tam on 10/18/13.
//  Copyright (c) 2013 Reverb. All rights reserved.
//

#import <UIKit/UIKit.h>

#import "AppDelegate.h"
#import "SWGEventsApi.h"

int main(int argc, char * argv[])
{
    @autoreleasepool {
SWGEventsApi * api = [[SWGEventsApi alloc] init];
[api findEventByIdWithCompletionBlock:@123
                    completionHandler:^(SWGEvent *event, NSError *error) {
                        if(error) {
                            // handle it
                        }
                        else {
                            // do something with the SWGEvent
                            NSLog(@"%@", [event asDictionary]);
                        }
                    }];
        
        return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));
    }
}
