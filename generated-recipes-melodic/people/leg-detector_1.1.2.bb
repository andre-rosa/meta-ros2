# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Leg Detector using a machine learning approach to find leg-like patterns of laser scanner readings."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Caroline Pantofaru"
HOMEPAGE = "http://ros.org/wiki/leg_detector"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "leg_detector"

ROS_BUILD_DEPENDS = " \
    bfl \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    laser-geometry \
    message-filters \
    people-msgs \
    people-tracking-filter \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bfl \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    laser-geometry \
    message-filters \
    people-msgs \
    people-tracking-filter \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bfl \
    dynamic-reconfigure \
    geometry-msgs \
    image-geometry \
    laser-filters \
    laser-geometry \
    map-laser \
    message-filters \
    people-msgs \
    people-tracking-filter \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/leg_detector/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7fc4444f3c7bc4fe1c20caa4d63031b8"
SRC_URI[sha256sum] = "e1865c4b5c768ff408d3d1cb531bf26dd6acac28f2a7ad5d25fe11cf6ed85bb8"
S = "${WORKDIR}/people-release-release-melodic-leg_detector-1.1.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('people', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('people', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/people_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/people-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
