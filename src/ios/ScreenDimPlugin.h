//
//  ScreenDimPlugin.h
//  ios-cordova
//
//  Created by Andrew Lunny on 12-07-11.
//  Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>
#ifdef CORDOVA_FRAMEWORK
#import <Cordova/CDVPlugin.h>
#else
#import "CDVPlugin.h"
#endif

@interface ScreenDimPlugin : CDVPlugin

- (void) enable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options;
- (void) disable:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options;

@end
