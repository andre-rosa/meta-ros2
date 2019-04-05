# Inherited by every recipe that superflore generates.

ROS_SUPERFLORE_GENERATED = "1"

# TODO it's a workaround to get rid of finding two-depth-depenedent
#      libraries from dependent package's recipe-sysroot.
do_install_append() {
    # do not export itself's absolute path of recipe-sysroot folder
    find ${D} -name "*.cmake" -exec sed -i 's:${RECIPE_SYSROOT}${includedir}:$ENV{STAGING_INCDIR}:g' {} \;
    find ${D} -name "*.cmake" -exec sed -i 's:${RECIPE_SYSROOT}${libdir}:$ENV{STAGING_LIBDIR}:g' {} \;
}
