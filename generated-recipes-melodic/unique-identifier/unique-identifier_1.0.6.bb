# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages and interfaces for universally unique identifiers.      Not needed for wet packages, use only to resolve dry stack     dependencies."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/unique_identifier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "unique_identifier"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    unique-id \
    uuid-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    unique-id \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/melodic/unique_identifier/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "acbc6d10cfe1c18eedd8539ce13d4476"
SRC_URI[sha256sum] = "d1e54e7f1f8f2d9a6e7d481ee0c300dc7440f3033915afba621257aac6ff7d8b"
S = "${WORKDIR}/unique_identifier-release-release-melodic-unique_identifier-1.0.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/unique-identifier/unique-identifier_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/unique-identifier/unique-identifier_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/unique-identifier-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/unique-identifier/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
