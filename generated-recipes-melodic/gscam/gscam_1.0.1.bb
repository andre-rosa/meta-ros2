# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A ROS camera driver that uses gstreamer to connect to     devices such as webcams."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gscam"
ROS_BPN = "gscam"

ROS_BUILD_DEPENDS = " \
    camera-calibration-parsers \
    camera-info-manager \
    cv-bridge \
    image-transport \
    libgstreamer-plugins-base1.0-dev \
    libgstreamer1.0-dev \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration-parsers \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-calibration-parsers \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-drivers-gbp/gscam-release/archive/release/melodic/gscam/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d6afd8c018bb5c5104a2b17aa4dab332"
SRC_URI[sha256sum] = "bbd838538ef852691f2de43b5b0a5541e0b8f4a8bd1c5ef7d0bb5c5387491996"
S = "${WORKDIR}/gscam-release-release-melodic-gscam-1.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('gscam', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('gscam', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gscam/gscam_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gscam/gscam-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gscam/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gscam/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
