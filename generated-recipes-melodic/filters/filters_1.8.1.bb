# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This library provides a standardized interface for processing data as a sequence      of filters.  This package contains a base class upon which to build specific implementations     as well as an interface which dynamically loads filters based on runtime parameters."
AUTHOR = "Tully Foote <tfoote@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "filters"
ROS_BPN = "filters"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    rosconsole \
    roscpp \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/filters-release/archive/release/melodic/filters/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7ebb7ea94ead71c5d1a5990dbce28a75"
SRC_URI[sha256sum] = "850380ab0564923c37a6ee93227fe934647a1c4e5dfb4c5d2502f156b6b17d3f"
S = "${WORKDIR}/filters-release-release-melodic-filters-1.8.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('filters', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('filters', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/filters/filters_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/filters/filters-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/filters/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/filters/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
