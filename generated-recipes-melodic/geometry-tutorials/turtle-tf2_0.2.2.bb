# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_tf2 demonstrates how to write a tf2 broadcaster and listener with the turtlesim. The tutle_tf2_listener commands turtle2 to follow turtle1 around as you drive turtle1 using the keyboard."
AUTHOR = "Denis Štogl <denis.stogl@mailbox.org>"
HOMEPAGE = "https://github.com/ros/geometry_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "turtle_tf2"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf2 \
    tf2-ros \
    turtlesim \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf2 \
    tf2-ros \
    turtlesim \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf2 \
    tf2-ros \
    turtlesim \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/melodic/turtle_tf2/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3fcd9349ea8dd39910ce0765bd7676ee"
SRC_URI[sha256sum] = "898be65b26bacc4c8ec117c9696b0506f18c33cce83c507442c3b4b239c64ada"
S = "${WORKDIR}/geometry_tutorials-release-release-melodic-turtle_tf2-0.2.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geometry-tutorials/geometry-tutorials_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geometry-tutorials/geometry-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry-tutorials/geometry-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geometry-tutorials/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
