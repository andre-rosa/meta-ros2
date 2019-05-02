# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for embedded Linux enviroments"
AUTHOR = "Paul Bouchier <paul.bouchier@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rosserial_embeddedlinux"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "rosserial_embeddedlinux"

ROS_BUILD_DEPENDS = " \
    rosserial-client \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rospy \
    rosserial-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rospy \
    rosserial-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_embeddedlinux/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "408aae640e0a1fe63c97ae066e762f46"
SRC_URI[sha256sum] = "3834be581ac1ed6d71d9481ec8fdb9818be429b348ebcbfa1dd2311faf4bab1b"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_embeddedlinux-0.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosserial/rosserial_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosserial/rosserial_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/rosserial-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosserial/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
