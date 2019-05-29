# Copyright (c) 2019 LG Electronics, Inc.

inherit ros_distro

# Place metadata unique to ROS 2 distros here.

# ROS1_COMPONENTS is set in conf/ros-distro/ros-distro.conf .
def ros_distro__get_component_type(component, d):
    return bb.utils.contains('ROS1_COMPONENTS', component, 'ros1', 'ros2', d)

do_install_append() {
    # If there's a recipe-sysroot path in the .cmake files, change it to be the global-sysroot path, because the recipe-sysroot-s
    # can get removed by "rm_work". We assume this is only an issue with ROS 2.
    if [ -n "${RECIPE_SYSROOT}" ]; then
        find ${D} -name '*.cmake' | xargs --no-run-if-empty sed -i -e 's@${RECIPE_SYSROOT}/@${STAGING_DIR_HOST}/@g'
    else
        true
    fi
}

do_install_append_class-target() {
    # The parent_prefix_path files are used on the target => remove the build tree from the paths. We assume this is only an issue
    # with ROS 2.
    if [ -d ${D}${datadir}/ament_index/resource_index/parent_prefix_path ]; then
        find ${D}${datadir}/ament_index/resource_index/parent_prefix_path -type f \
            | xargs --no-run-if-empty sed -i -e 's@${STAGING_DIR_HOST}/@/@g' -e 's@${STAGING_DIR_NATIVE}/@/@g'
    else
        true
    fi
}
