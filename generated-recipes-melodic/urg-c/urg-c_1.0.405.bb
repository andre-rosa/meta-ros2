# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The urg_c package"
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
HOMEPAGE = "http://sourceforge.net/projects/urgwidget/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/urg_c-release/archive/release/melodic/urg_c/1.0.405-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f5c5677ed039c6d1a59d40b3d87e78e"
SRC_URI[sha256sum] = "f747da6d3ab437c8a455194bbd9cf64f84798700d7458584c77916f9c479691a"
S = "${WORKDIR}/urg_c-release-release-melodic-urg_c-1.0.405-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/urg-c/urg-c_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/urg-c/urg-c_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urg-c/urg-c-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urg-c/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/urg-c/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
