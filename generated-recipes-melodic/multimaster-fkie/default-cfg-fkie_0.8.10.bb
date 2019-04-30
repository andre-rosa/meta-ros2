# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The configuration node loads a given launch configuration and offers services to       list or start the contained nodes. It provides additional description       extracted from launch file. This is used by node_manager_fkie."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/default_cfg_fkie"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    multimaster-msgs-fkie \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    multimaster-msgs-fkie \
    roslaunch \
    roslib \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    multimaster-msgs-fkie \
    roslaunch \
    roslib \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/default_cfg_fkie/0.8.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bbd95256566d80e2f30ae42eea206ade"
SRC_URI[sha256sum] = "597115fae1876c7b86e7aa7f919eb130d9e03bc5ca4978653e2a3d09344b98f2"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-default_cfg_fkie-0.8.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/multimaster-fkie/multimaster-fkie_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/multimaster-fkie/multimaster-fkie_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/multimaster-fkie-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multimaster-fkie/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
