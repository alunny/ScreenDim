//
//  ScreenDimPlugin.m
//  ios-cordova
//
//  Created by Andrew Lunny on 12-07-11.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

#import "ScreenDimPlugin.h"

@implementation ScreenDimPlugin

- (void) enable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options
{	
    [[UIApplication sharedApplication] setIdleTimerDisabled:NO];
}


- (void) disable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options 
{   
    [[UIApplication sharedApplication] setIdleTimerDisabled:YES];
}

@end
