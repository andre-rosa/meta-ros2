# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "<p>       Contains a node that rotates an image stream in a way that minimizes       the angle between a vector in some arbitrary frame and a vector in the       camera frame. The frame of the outgoing image is published by the node.     </p>     <p>       This node is intended to allow camera images to be visualized in an       orientation that is more intuitive than the hardware-constrained       orientation of the physical camera. This is particularly helpful, for       example, to show images from the PR2's forearm cameras with a       consistent up direction, despite the fact that the forearms need to       rotate in arbitrary ways during manipulation.     </p>     <p>       It is not recommended to use the output from this node for further       computation, as it interpolates the source image, introduces black       borders, and does not output a camera_info.     </p>"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://ros.org/wiki/image_rotate"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_pipeline"
ROS_BPN = "image_rotate"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    nodelet \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_rotate/1.12.23-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3db2d8d3febcdef288f5abf253d19a90"
SRC_URI[sha256sum] = "300158018b97ce2b2f3cdfac00889d443b74165b3fb49105317148c76657638a"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_rotate-1.12.23-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('image-pipeline', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('image-pipeline', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/image-pipeline_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/image-pipeline-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}