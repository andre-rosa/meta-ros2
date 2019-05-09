# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Lincoln MKZ DBW kit"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dbw_mkz_ros"
ROS_BPN = "dbw_mkz"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dbw-mkz-can \
    dbw-mkz-description \
    dbw-mkz-joystick-demo \
    dbw-mkz-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c7ce68ffb8c74ff4e29f88036bba57dc"
SRC_URI[sha256sum] = "a4531c8d8bbdb6ef3afffc027dd8399aa74cebe90ff43153b1197b45e447ef4d"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz-1.1.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('dbw-mkz-ros', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('dbw-mkz-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dbw-mkz-ros/dbw-mkz-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dbw-mkz-ros/dbw-mkz-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dbw-mkz-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dbw-mkz-ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
