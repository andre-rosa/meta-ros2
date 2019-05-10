# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://wiki.ros.org/rqt_image_view"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_image_view"
ROS_BPN = "rqt_image_view"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    qtbase \
    rqt-gui \
    rqt-gui-cpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    rqt-gui \
    rqt-gui-cpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    rqt-gui \
    rqt-gui-cpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_image_view-release/archive/release/melodic/rqt_image_view/0.4.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "018d24cfe03c30ce71059ef99d55bea0"
SRC_URI[sha256sum] = "adbd60be7c1f3517942285d3bcb166f838d362e88a910192bdaa35dc193126e3"
S = "${WORKDIR}/rqt_image_view-release-release-melodic-rqt_image_view-0.4.13-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-image-view', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-image-view', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-image-view/rqt-image-view_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-image-view/rqt-image-view-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-image-view/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-image-view/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
