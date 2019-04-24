# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The assisted_teleop node subscribes to a desired trajectory topic     (geometry_msgs/Twist) and uses TrajectoryPlannerROS to find a valid     trajectory close to the desired trajectory before republishing. Useful for     filtering teleop commands while avoiding obstacles. This package also     contains LaserScanMaxRangeFilter, which is a LaserScan filter plugin that     takes max range values in a scan and turns them into valid values that are     slightly less than max range."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/assisted_teleop"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/assisted_teleop/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dc9577f4a24e14fc4c629d1382f1e022"
SRC_URI[sha256sum] = "5cf3f26df26c9c7a8045f5d75aa0b6b6fecccd58a38495b850c49b94540969e5"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-assisted_teleop-0.3.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/navigation-experimental-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation-experimental/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
