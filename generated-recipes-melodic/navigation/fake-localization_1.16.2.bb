# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS node that simply forwards odometry information."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/fake_localization"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "fake_localization"

ROS_BUILD_DEPENDS = " \
    angles \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rosconsole \
    roscpp \
    rospy \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rosconsole \
    roscpp \
    rospy \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rosconsole \
    roscpp \
    rospy \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/fake_localization/1.16.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "421247d55a69020aaf414bb25935765b"
SRC_URI[sha256sum] = "d18ea7beb5f10b7eb2ea3d1578f8ae3b2d4db9f314ac25ed8d130a90cec74450"
S = "${WORKDIR}/navigation-release-release-melodic-fake_localization-1.16.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
