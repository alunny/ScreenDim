(function (gap) {
    // dims by default
    var on = true;

    gap.screenDim = { };

    gap.screenDim.enable = function () {
        on = true;
        gap.exec(null, null, 'ScreenDim', 'enable', []);
    };

    gap.screenDim.disable = function () {
        on = false;
        gap.exec(null, null, 'ScreenDim', 'disable', []);
    };

    gap.screenDim.toggle = function () {
        if (on) {
            this.disable();
        } else {
            this.enable();
        }
    };
}).call(this, (window.cordova || window.Cordova));
